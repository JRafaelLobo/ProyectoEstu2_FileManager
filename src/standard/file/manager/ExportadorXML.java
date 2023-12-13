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
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.transform.TransformerException;

public class ExportadorXML {

    public static boolean exportarConSchema(ArrayList<String> registros, String archivoTxt, String archivoXslt, String archivoXml) {
        try {
            // Analizar la estructura del archivo TXT y generar dinámicamente el contenido del archivo XSLT
            String estructura = obtenerEstructuraDesdeArchivoTxt(archivoTxt);
            String contenidoXSLT = generarContenidoXSLT(estructura);

            // Guardar el contenido generado en el archivo XSLT
            guardarContenidoEnArchivo(archivoXslt, contenidoXSLT);

            // Aplicar la transformación XSLT a cada registro y escribir en el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(new StringReader(contenidoXSLT)));

            for (String registro : registros) {
                // Aquí asumo que el método aplicarTransformacionXSLT devuelve el resultado de la transformación
                String resultadoTransformacion = aplicarTransformacionXSLT(transformer, registro);
                guardarContenidoEnArchivo(archivoXml, resultadoTransformacion);
            }

            System.out.println("Exportación exitosa a XML con Schema.");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String aplicarTransformacionXSLT(Transformer transformer, String registro) throws TransformerException {
        // Aquí aplicas la transformación XSLT a un registro individual
        // Puedes utilizar un StringReader para convertir el registro en un StreamSource
        // y StringWriter para capturar la salida de la transformación
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
