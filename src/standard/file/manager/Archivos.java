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

public class Archivos {
    public String LecturaCampos(String FileName){
        String appData = System.getenv("APPDATA");
        String carpetaEnAppData = appData + File.separator + "Files_StructData";
        String rutaArchivo = carpetaEnAppData + File.separator + FileName;
        try {
                // Leer la primera línea del archivo
                BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
                String primeraLinea = lector.readLine();
                lector.close();
                if (primeraLinea == null){
                    return "";
                }
                return primeraLinea;
            } catch (IOException e) {
                System.err.println("Hubo un error al leer campos: " + e.getMessage());
                return "Hubo un error al leer campos";
            }
    }
    public boolean GuardarCampos(String FileName, String newCampos){
        String appData = System.getenv("APPDATA");
        String carpetaEnAppData = appData + File.separator + "Files_StructData";
        String rutaArchivo = carpetaEnAppData + File.separator + FileName;
        if(!newCampos.equals("")){
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
    public String[] getNameFiles(){
        String appData = System.getenv("APPDATA");
        String carpetaEnAppData = appData + File.separator + "Files_StructData";
        File carpeta = new File(carpetaEnAppData);
        FilenameFilter filtro = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        };
        String[] archivos = carpeta.list(filtro);

        return archivos;
    }
    public boolean Nuevo(String nameOfFile){
        String appData = System.getenv("APPDATA");
        String carpetaEnAppData = appData + File.separator + "Files_StructData";
        String rutaCompleta = carpetaEnAppData + File.separator + nameOfFile+".txt";
        File directorio = new File(carpetaEnAppData);
        File archivo = new File(rutaCompleta);
        try {
            // Crear el directorio si no existe
            if (!directorio.exists()) {
                directorio.mkdirs();
            }

            // Crear el archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con éxito en: " + rutaCompleta);

                return true;
            } else {
                System.out.println("El archivo ya existe en: " + rutaCompleta);
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("El archivo no se pudo crear");
            return false;
        }
    }
}
