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

    int Cabezal;
    private String nombre;
    private ArrayList<Campo> listaCampos = new ArrayList();

    public String LecturaPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo de texto");
        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }else{
            return "";
        }
    }

    public boolean GuardarCampos(String FileName, String newCampos) {
        String appData = System.getenv("APPDATA");
        String carpetaEnAppData = appData + File.separator + "Files_StructData";
        String rutaArchivo = carpetaEnAppData + File.separator + FileName;
        if (!newCampos.equals("")) {
            try {
                // Leer la primera línea del archivo
                BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
                String primeraLinea = lector.readLine();
                lector.close();
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo));
                escritor.write(newCampos);
                escritor.newLine();
                escritor.close();
                return true;
            } catch (IOException e) {
                System.err.println("Hubo un error al escribir los campos: " + e.getMessage());
                return false;
            }
        }
        //Este return solo es para que no tire error
        return false;
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
                        temp += ",";
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

    public String Abrir(String rutaArchivo) {

        try {
            // Leer la primera línea del archivo
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String primeraLinea = lector.readLine();
            lector.close();
            if (primeraLinea == null) {
                return "";
            }

            //metodo para leer archivo
            primeraLinea = primeraLinea.replace("{", "");
            primeraLinea = primeraLinea.replace("}", "");
            String[] divicion = primeraLinea.split(",");

            listaCampos.clear();
            for (int i = 0; i < divicion.length; i++) {
                String cadena = divicion[i];
                boolean esNombre = true, esTipo = false, esNumero = false;
                int j = 0;
                String nombre = "", tipo = "", numero = "";
                while (j < cadena.length() - 1) {
                    char letra = cadena.charAt(j);
                    if (letra == ':') {
                        j += 2;
                        esNombre = false;
                        esTipo = true;
                        continue;
                    }
                    if (letra == '[') {
                        j++;
                        esTipo = false;
                        esNumero = true;
                        continue;
                    }
                    if (letra == ']') {
                        break;
                    }
                    if (esNombre) {
                        nombre += cadena.charAt(j);

                    }
                    if (esTipo) {
                        tipo += cadena.charAt(j);
                    }
                    if (esNumero) {
                        numero += cadena.charAt(j);
                    }
                    j++;
                }
                listaCampos.add(new Campo(nombre, Integer.valueOf(numero), tipo));
            }

            return primeraLinea;
        } catch (IOException e) {
            System.err.println("Hubo un error al leer campos: " + e.getMessage());
            return "Hubo un error al leer campos";
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

}
