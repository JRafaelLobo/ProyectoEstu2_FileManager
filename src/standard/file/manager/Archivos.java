/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

/**
 *
 * @author ADMIN
 */
import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Archivos {
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
        for (String archivo : archivos) {
            System.out.println(archivo);
        }

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
            System.out.println("El archivo no se pudo crear");
            return false;
        }
    }
}
