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
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.xml.transform.TransformerException;

public class ExportadorXML {

    public static boolean convertTxtToXml(ArrayList<Campo> campos, ArrayList<String> registros, String archivoTxt, String xsltFilePath, String xmlOutputFilePath) throws IOException {
        File newFile = new File("newFile");
        System.out.println(newFile.getAbsolutePath());
        try (PrintWriter writer = new PrintWriter(new FileWriter(newFile))) {
//            // Analizar la estructura del archivo TXT y generar dinámicamente el contenido del archivo XSLT
//            String estructura = obtenerEstructuraDesdeArchivoTxt(archivoTxt);
//            String contenidoXSLT = generarContenidoXSLT(estructura);
//
//            // Guardar el contenido generado en el archivo XSLT
//            guardarContenidoEnArchivo(xsltFilePath, contenidoXSLT);
            // Crear un archivo temporal con los datos del txt
            // Escribir los campos y registros en el archivo temporal
            for (Campo campo : campos) {
                writer.print(campo.getNombre() + "|");
            }
            writer.println(); // Nueva línea después de los campos

            for (String registro : registros) {
                writer.println(registro.trim());
            }

            writer.close();

// Leer el contenido del archivo temporal y limpiarlo
            String contenido = new String(Files.readAllBytes(newFile.toPath()), StandardCharsets.UTF_8);
            contenido = contenido.trim(); // Eliminar espacios en blanco al principio y al final

            try (PrintWriter cleanWriter = new PrintWriter(new FileWriter(newFile))) {
                cleanWriter.print(contenido);
            }

// Configurar la transformación XSLT
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(new File(xsltFilePath)));
            transformer.transform(new StreamSource(newFile), new StreamResult(new File(xmlOutputFilePath)));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String aplicarTransformacionXSLT(Transformer transformer, String registro) throws TransformerException {
        // Transforma directamente el registro en lugar de usar StringReader
        StringWriter resultado = new StringWriter();
        transformer.transform(new StreamSource(new StringReader(registro)), new StreamResult(resultado));
        return resultado.toString();
    }

    public static String obtenerEstructuraDesdeArchivoTxt(String archivoTxt) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoTxt))) {
            String primeraLinea = reader.readLine();

            if (primeraLinea != null && primeraLinea.startsWith("{") && primeraLinea.endsWith("}")) {
                // Si la primera línea tiene un formato válido (comienza y termina con corchetes)
                return primeraLinea.substring(1, primeraLinea.length() - 1); // Eliminar los corchetes al inicio y al final
            } else {
                throw new IOException("La primera línea del archivo no tiene un formato válido.");
            }
        }
    }

    public static String generarContenidoXSLT(String estructura) {
        StringBuilder contenido = new StringBuilder();
        contenido.append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n");
        contenido.append("  <xsl:output method=\"xml\" indent=\"yes\"/>\n"); // Añade esta línea para formatear la salida XML
        contenido.append("  <xsl:template match=\"/\">\n");
        contenido.append("    <registros>\n");

        String[] campos = estructura.split("\\|");
        for (String campo : campos) {
            String[] atributos = campo.split(",");
            String nombreCampo = atributos[0];
            contenido.append("      <xsl:apply-templates select=\"").append(nombreCampo).append("\"/>\n");
        }

        contenido.append("    </registros>\n");
        contenido.append("  </xsl:template>\n");

        for (String campo : campos) {
            String[] atributos = campo.split(",");
            String nombreCampo = atributos[0];
            contenido.append("  <xsl:template match=\"").append(nombreCampo).append("\">\n");
            contenido.append("    <").append(nombreCampo).append(">\n");
            contenido.append("      <xsl:value-of select=\".\"/>\n");
            contenido.append("    </").append(nombreCampo).append(">\n");
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
