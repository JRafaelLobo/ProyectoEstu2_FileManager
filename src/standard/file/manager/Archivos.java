/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivos {

    private String nombre;
    private ArrayList<Campo> listaCampos = new ArrayList();
    private ArrayList<Registro> registros = new ArrayList();
    private final LinkedList availist = new LinkedList(-1);
    private int longitudTotalRegistro = 0;
    private int longitudTotalCampos = 0;
    private int longitudTotalDeMetadata = 0;
    private String rutaArchivo = "";

    public void LecturaPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo de texto");

        // Añadir un filtro para mostrar solo archivos con extensión .txt
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Verificar si el archivo seleccionado tiene la extensión .txt
            if (selectedFile.getName().toLowerCase().endsWith(".txt")) {
                nombre = fileChooser.getName(selectedFile);
                this.rutaArchivo = selectedFile.getAbsolutePath();
            } else {
                System.out.println("Selecciona un archivo con extensión .txt");
                // Puedes mostrar un mensaje al usuario indicando que seleccione un archivo .txt
                this.rutaArchivo = "F";
            }
        } else {
            this.rutaArchivo = "";
        }
    }
    
    private boolean ReEscribirCabeza(){
        try (RandomAccessFile file = new RandomAccessFile(this.rutaArchivo, "rw")) {
           file.seek(this.longitudTotalCampos+4);
           String newCabeza = "*";
           newCabeza += String.valueOf(this.availist.getCabeza().getSlot());
           newCabeza = String.format("%-" + this.longitudTotalRegistro + "s", newCabeza);
           file.writeBytes(newCabeza);
           
           if(this.availist.getCabeza().getSiguiente() == null) return true;
           
           file.seek((this.longitudTotalDeMetadata)+((this.longitudTotalRegistro)*(int)this.availist.getCabeza().getSlot()));
           String newSlot = "*";
           newSlot += String.valueOf(this.availist.getCabeza().getSiguiente().getSlot());
           newSlot = String.format("%-" + this.longitudTotalRegistro + "s", newSlot);
           file.writeBytes(newSlot);
        } catch (IOException e) {
            System.err.println("Sucedio un error al reescribir la cabeza de la metadata: "+e.getMessage());
            return false;
        } 
        return true;
    }
    
    public boolean insertarRegistro(String Registro){
        try (RandomAccessFile file = new RandomAccessFile(this.rutaArchivo, "rw")) {
           if(Registro.length() > this.longitudTotalRegistro) return false;
           
           if(Registro.length() < this.longitudTotalRegistro){
               Registro = String.format("%-" + longitudTotalRegistro + "s", Registro);
           }
           
           if(this.availist.getCabeza().getSlot().equals(-1)){
               file.seek(file.length());
           }else{
               file.seek((this.longitudTotalDeMetadata)+((this.longitudTotalRegistro)*(int)this.availist.getCabeza().getSlot()));
           }
           
           file.writeBytes(Registro);
           if(!this.availist.getCabeza().getSlot().equals(-1)){
               this.availist.removeAvai(this.availist.getCabeza().getSlot());
               return this.ReEscribirCabeza();
           }
        } catch (IOException e) {
            System.err.println("Sucedio un error al insertar registros: "+e.getMessage());
            return false;
        } 
        
        return true;
    }

    private boolean GuardarCampos() {
        try {
            // Leer la primera línea del archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(this.rutaArchivo));
            String temp = "";
            if (!listaCampos.isEmpty()) {
                temp += "{";
                for (int i = 0; i < listaCampos.size(); i++) {
                    temp += listaCampos.get(i).toString();
                    if (i != listaCampos.size() - 1) {
                        temp += "|";
                    }
                }
                temp += "}";
            }

            escritor.write(temp);
            if (!temp.equals("")) {
                this.longitudTotalCampos = temp.length();
                escritor.newLine();
                this.longitudTotalRegistro = 0;
                for (int i = 0; i < this.listaCampos.size(); i++) {
                    this.longitudTotalRegistro += listaCampos.get(i).getTamano() + 1;
                }
                String cabeza = "*-1";
                for (int i = cabeza.length(); i < this.longitudTotalRegistro; i++) {
                    cabeza += " ";
                }

                escritor.write(cabeza);
                escritor.newLine();
            }
            escritor.close();
            return true;
        } catch (IOException e) {
            System.err.println("Hubo un error al escribir los campos: " + e.getMessage());
            return false;
        }
    }

    public boolean Guardar( boolean isGuardarCampos) {
        if (isGuardarCampos) {
            return this.GuardarCampos();
        }

        return false;
    }

    private boolean AbrirCampos() {
        try {
            // Leer la primera línea del archivo
            BufferedReader lector = new BufferedReader(new FileReader(this.rutaArchivo));
            String primeraLinea = lector.readLine();                   
            lector.close();            
         
            if (primeraLinea == null) {
                return true;
            }

            //metodo para leer archivo
            if (primeraLinea.charAt(0) != '{') {
                return false;
            }
            primeraLinea = primeraLinea.replace("{", "");
            primeraLinea = primeraLinea.replace("}", "");
            String[] divicion = primeraLinea.split("\\|");

            listaCampos.clear();
            this.longitudTotalRegistro = 0;
            for (int i = 0; i < divicion.length; i++) {
                String[] arregloCampo = divicion[i].split(",");
                listaCampos.add(new Campo(arregloCampo[0], arregloCampo[1], Integer.valueOf(arregloCampo[2]), Boolean.parseBoolean(arregloCampo[3])));
                this.longitudTotalRegistro += Integer.valueOf(arregloCampo[2]) + 1;
            }
            this.longitudTotalCampos = primeraLinea.length();
            return true;
        } catch (IOException e) {
            System.err.println("Hubo un error al cargar los campos: " + e.getMessage());
            return false;
        }
    }

    private boolean ConstruirAvailist(boolean isReadCabeza, int pos) {
        try (RandomAccessFile file = new RandomAccessFile(this.rutaArchivo, "rw")) {
            byte[] buffer;
            int bytesRead;
            if (isReadCabeza) {
                file.seek(this.longitudTotalCampos + 2);
                buffer = new byte[longitudTotalRegistro+2];
                bytesRead = file.read(buffer);
            }else{
                file.seek((this.longitudTotalDeMetadata)+((this.longitudTotalRegistro)*pos));
                buffer = new byte[this.longitudTotalRegistro];
                bytesRead = file.read(buffer);
            }

            if (bytesRead == -1) {
                return isReadCabeza || false;
            }
            
            String contenido = new String(buffer, 0, bytesRead);
            int slot = Integer.parseInt(contenido.trim().replace("*", ""));
            if(slot == -1){
                return true;
            }
            this.availist.constructionAvai(slot);
            this.ConstruirAvailist(false, slot);
        } catch (IOException e) {
            System.err.println("Sucedio un error al construir la availist: "+e.getMessage());
            return false;
        }
        return true;
    }

    public boolean Abrir() {
        boolean campoIsOpen = this.AbrirCampos();
        this.longitudTotalDeMetadata = this.longitudTotalCampos + 2 +this.longitudTotalRegistro+4;
        boolean isContructionAvai = this.ConstruirAvailist(true, -1);
        //insertarRegistro("1234567890123|1234567890123456789012345678901234|1234567890123456789012345678901234567890123|123456789012|");
        return campoIsOpen && isContructionAvai;
    }

    public char Nuevo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo de texto");

        // Añadir un filtro para mostrar solo archivos con extensión .txt
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Asegurarse de que el nombre del archivo tenga la extensión .txt
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".txt")) {
                fileToSave = new File(filePath + ".txt");
                filePath = fileToSave.getAbsolutePath();
            }

            // Verificar si el archivo ya existe antes de intentar crearlo
            if (fileToSave.exists()) {
                System.out.println("El archivo ya existe en: " + filePath);
                return 'E';
            }

            try {
                if (fileToSave.createNewFile()) {
                    System.out.println("Archivo creado con éxito en: " + filePath);
                    return 'T';
                } else {
                    System.out.println("El archivo no se pudo crear");
                    return 'F';
                }

            } catch (IOException e) {
                System.err.println("El archivo no se pudo crear " + e.getMessage());
                return 'F';
            }
        }
        return 'C'; // Cancelado
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Campo> getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(ArrayList<Campo> listaCampos) {
        this.listaCampos = listaCampos;
    }

    public LinkedList getAvailist() {
        return this.availist;
    }
    
    public void clear(){
        this.listaCampos.clear();
        this.availist.clearAvai();
        this.longitudTotalRegistro = 0;
        this.longitudTotalCampos = 0;
        this.longitudTotalDeMetadata = 0;
    }
    
    public boolean canBeEnableCampos (){
        try (RandomAccessFile file = new RandomAccessFile(this.rutaArchivo, "rw")) {
           return file.length() == 0 || file.length() == longitudTotalDeMetadata;
        } catch (IOException e) {
            System.err.println("Sucedio un error al reescribir la cabeza de la metadata: "+e.getMessage());
            return false;
        } 
    }
    
    public void setRutaArchivo(String rutaArchivo){
        this.rutaArchivo = rutaArchivo;
    }
    
    public String getRutaArchivo(){
        return this.rutaArchivo;
    }
}
