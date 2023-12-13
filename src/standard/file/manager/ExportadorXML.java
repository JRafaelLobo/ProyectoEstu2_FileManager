package standard.file.manager;

import java.io.BufferedReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ExportadorXML {

    public static boolean exportarConSchema(String archivoTxt, String archivoXslt, String archivoXml) {
        try {
            // Analizar la estructura del archivo TXT y generar dinámicamente el contenido del archivo XSLT
            String estructura = obtenerEstructuraDesdeArchivoTxt(archivoTxt);
            String contenidoXSLT = generarContenidoXSLT(estructura);

            // Guardar el contenido generado en el archivo XSLT
            guardarContenidoEnArchivo(archivoXslt, contenidoXSLT);

            // Aplicar la transformación XSLT al archivo TXT
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new File(archivoXslt)));
            transformer.transform(new StreamSource(new File(archivoTxt)), new StreamResult(new File(archivoXml)));

            System.out.println("Exportación exitosa a XML con Schema.");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String obtenerEstructuraDesdeArchivoTxt(String archivoTxt) throws IOException {
        // Aquí implementa la lógica para leer el contenido del archivo TXT y extraer la estructura
        // Puedes utilizar expresiones regulares o cualquier otro método que se ajuste a la estructura de tus datos
        // El siguiente es un ejemplo básico basado en el formato proporcionado
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoTxt))) {
            String primeraLinea = reader.readLine();
            return primeraLinea.substring(1, primeraLinea.length() - 1); // Eliminar los corchetes al inicio y al final
        }
    }

    public static String generarContenidoXSLT(String estructura) {
        // Aquí implementa la lógica para generar dinámicamente el contenido del archivo XSLT según la estructura proporcionada
        // El siguiente es un ejemplo básico basado en el formato proporcionado
        StringBuilder contenido = new StringBuilder();
        contenido.append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n");
        contenido.append("  <xsl:template match=\"/\">\n");
        contenido.append("    <registros>\n");
        
        String[] campos = estructura.split("\\|");
        for (String campo : campos) {
            String[] atributos = campo.split(",");
            String nombreCampo = atributos[0];
            String tipoDato = atributos[1];
            contenido.append("      <xsl:apply-templates select=\"").append(tipoDato).append("\"/>\n");
        }
        
        contenido.append("    </registros>\n");
        contenido.append("  </xsl:template>\n");

        for (String campo : campos) {
            String[] atributos = campo.split(",");
            String nombreCampo = atributos[0];
            String tipoDato = atributos[1];
            
            contenido.append("  <xsl:template match=\"").append(tipoDato).append("\">\n");
            contenido.append("    <").append(tipoDato).append(">\n");
            contenido.append("      <xsl:value-of select=\".\"/>\n");
            contenido.append("    </").append(tipoDato).append(">\n");
            contenido.append("  </xsl:template>\n");
        }
        
        contenido.append("</xsl:stylesheet>\n");
        return contenido.toString();
    }

    public static void guardarContenidoEnArchivo(String rutaArchivo, String contenido) throws IOException {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write(contenido);
        }
    }
}
