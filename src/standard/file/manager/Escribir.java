package standard.file.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Escribir {

    File archivo;

    public String toString() {
        return "A ver como personalizamos eso";
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
//            for (Usuario t : usu) {
//                bw.write(t.getUsername() + ";");
//                bw.write(t.getContra() + ";");
//                bw.write(t.getAnio() + ";");
//                bw.write("\n");
//                if (t instanceof Artistas) {
//                    bw.write(((Artistas) t).getNombre() + ";");
//                } else {
//                    bw.write(";");
//                }
//            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
//        usu = new ArrayList();
//        if (archivo.exists()) {
//            try {
//                sc = new Scanner(archivo);
//                sc.useDelimiter(";");
//                while (sc.hasNext()) {
//                    String[] aa = sc.nextLine().split(";");
//
//                    if (aa[4].equals("")) {
//                        usu.add(new Oyente(sc.next(), sc.next(), sc.nextInt()));
//                    } else {
//                        usu.add(new Artistas(sc.next(), sc.next(), sc.nextInt(), sc.next()));
//                    }
//                }
//            } catch (Exception ex) {
//            }
//        sc.close();
//    }//FIN IF
}
}
