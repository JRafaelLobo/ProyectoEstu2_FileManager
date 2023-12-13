package standard.file.manager;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ExportadorXML extends Archivos{

    public boolean exportarXML( Archivos file) {
        try {
            this.listaCampos = file.listaCampos;
            this.longitudTotalDeMetadata = file.longitudTotalDeMetadata;
            this.rutaArchivo = file.rutaArchivo;
            this.longitudTotalRegistro = file.longitudTotalRegistro;
            crearXsl();
            // Cargar la plantilla XSLT
            Source xslt = new StreamSource(new FileInputStream(this.rutaArchivo.replace("txt", "xsl")));

            // Crear la fábrica de transformadores
            TransformerFactory factory = TransformerFactory.newInstance();

            // Crear un transformador para la plantilla XSLT
            Transformer transformer = factory.newTransformer(xslt);

            // Crear la fuente de entrada con los registros
            Source registrosSource = new StreamSource(new StringReader(generarXML()));

            // Crear la salida, en este caso, un archivo XML
            Result outputTarget = new StreamResult(new File(this.rutaArchivo.replace("txt", "xml")));

            // Aplicar la transformación y escribir el resultado en el archivo de salida
            transformer.transform(registrosSource, outputTarget);

            System.out.println("Transformación exitosa. El archivo XML se ha creado.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private String generarXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<data>");
        try (RandomAccessFile file = new RandomAccessFile(this.rutaArchivo, "rw")) {
            int i = longitudTotalDeMetadata;
            while (i < file.length()) {
                file.seek(i);
                byte[] buffer = new byte[this.longitudTotalRegistro];
                int bytesRead = file.read(buffer);
                String registro = new String(buffer, 0, bytesRead);
                i += longitudTotalRegistro;
                if (registro.charAt(0) == '*') {
                    continue;
                }
                xml.append("<record>");
                String[] register = registro.trim().split("\\|");
                for (int j = 0; j < register.length; j++) {
                    xml.append("        <").append(listaCampos.get(j).getNombre()).append(">").append(register[j]).append("</").append(listaCampos.get(j).getNombre()).append(">\n");
                }
                xml.append("</record>");
            }

        } catch (IOException e) {
            System.err.println("Sucedio un error al obtener todos los registros: " + e.getMessage());
        }
        xml.append("</data>");
        return xml.toString();
    }

    private void crearXsl() throws IOException {
        try {
            StringBuilder contenidoXSL = new StringBuilder();
            contenidoXSL.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n")
                    .append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n")
                    .append("    <xsl:output method=\"xml\" indent=\"yes\"/>\n\n")
                    .append("    <xsl:template match=\"/\">\n")
                    .append("        <root>\n")
                    .append("            <xsl:for-each select=\"data/record\">\n")
                    .append("                <registro>\n");

            for (Campo campos : this.listaCampos) {
                contenidoXSL.append("                    <").append(campos.getNombre()).append("><xsl:value-of select=\"").append(campos.getNombre()).append("\"/></").append(campos.getNombre()).append(">\n");
            }
                    contenidoXSL.append("                </registro>\n")
                    .append("            </xsl:for-each>\n")
                    .append("        </root>\n")
                    .append("    </xsl:template>\n")
                    .append("</xsl:stylesheet>");

            // Ruta del archivo XSL
            String rutaArchivoXSL = this.rutaArchivo.replace("txt", "xsl");

            // Crear el archivo XSL
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoXSL));
            writer.write(contenidoXSL.toString());
            writer.close();

            System.out.println("Archivo XSL creado exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
