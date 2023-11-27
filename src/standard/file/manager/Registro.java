package standard.file.manager;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Campo> campos;
    private ArrayList<Object> Datos = new ArrayList();
    private ArrayList<String> tipos = new ArrayList<>();

    public Registro(ArrayList<Campo> C) {
        campos = C;
        InicializacionDelRegistro();
    }
    
    public void InicializacionDelRegistro(){
        for(Campo C: campos ){
            tipos.add(C.getTipo());
        }
    }
}
