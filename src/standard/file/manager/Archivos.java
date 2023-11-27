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

public class Archivos {

    private String nombre;
    private ArrayList<Campo> listaCampos = new ArrayList();
    private ArrayList<Registro> registros = new ArrayList();
    private LinkedList availist = new LinkedList(-1);

    public String LecturaPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo de texto");
        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            nombre = fileChooser.getName(selectedFile);
            return selectedFile.getAbsolutePath();
        } else {
            return "";
        }
    }

    public boolean Guardar(String rutaArchivo) {
        try {
            // Leer la primera línea del archivo
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            lector.readLine();
            lector.close();
            BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo));

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
            //escritor.newLine();
            escritor.close();
            return true;
        } catch (IOException e) {
            System.err.println("Hubo un error al escribir los campos: " + e.getMessage());
            return false;
        }
    }

    public boolean Abrir(String rutaArchivo) {

        try {
            // Leer la primera línea del archivo
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String primeraLinea = lector.readLine();
            lector.close();
            if (primeraLinea == null) {
                return true;
            }

            //metodo para leer archivo
            if (primeraLinea.charAt(0) != '{') {
                return true;
            }
            primeraLinea = primeraLinea.replace("{", "");
            primeraLinea = primeraLinea.replace("}", "");
            String[] divicion = primeraLinea.split("\\|");

            listaCampos.clear();
            for (int i = 0; i < divicion.length; i++) {
                String[] arregloCampo = divicion[i].split(",");
                listaCampos.add(new Campo(arregloCampo[0], arregloCampo[1], Integer.valueOf(arregloCampo[2]), Boolean.parseBoolean(arregloCampo[3])));
            }
            return true;
        } catch (IOException e) {
            System.err.println("Hubo un error al cargar el archivo: " + e.getMessage());
            return false;
        }
    }

    public char Nuevo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo de texto");

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            try {
                if (fileToSave.createNewFile()) {
                    System.out.println("Archivo creado con éxito en: " + filePath);
                    return 'T';
                } else {
                    System.out.println("El archivo ya existe en: " + filePath);
                    return 'E';
                }

            } catch (IOException e) {
                System.err.println("El archivo no se pudo crear " + e.getMessage());
                return 'F';
            }
        }
        return 'C';
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
    public LinkedList getAvailist(){
        return this.availist;
    }

}
