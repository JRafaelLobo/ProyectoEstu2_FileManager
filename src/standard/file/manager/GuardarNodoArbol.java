package standard.file.manager;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author rinal
 */
public class GuardarNodoArbol {

    private NodoArbol B;
    private File archivo;

    public GuardarNodoArbol(String ruta) {
        archivo = new File(ruta);
    }

    public GuardarNodoArbol(NodoArbol B) {
        this.B = B;
    }

    public void escribirArchivo(NodoArbol B) {
        this.B = B;
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            bw.writeObject(B);
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivo() {
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    B = (NodoArbol) objeto.readObject();
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean FileExist() {
        return archivo.exists();
    }

    public void DelFile() {
        if (archivo.exists()) {
            archivo.delete();
        }
    }
}
