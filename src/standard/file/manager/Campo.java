package standard.file.manager;

public class Campo {

    private String Nombre, Tipo;
    private int Tamano;
    private boolean esLLave;
    private boolean esLlaveSecundaria;

    /*tipos
    1:int
    2:double o float
    3:caracter
     */
    public Campo(String Nombre, int Tamano, String Tipo) {
        this.Nombre = Nombre;
        this.Tamano = Tamano;
        this.Tipo = Tipo;
        esLLave = false;
        esLlaveSecundaria = false;
    }

    public Campo(String Nombre, String Tipo, int Tamano, boolean esLLave, boolean esLlaveSecundaria) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Tamano = Tamano;
        this.esLLave = esLLave;
        this.esLlaveSecundaria = esLlaveSecundaria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public boolean isEsLlaveSecundaria() {
        return esLlaveSecundaria;
    }

    public void setEsLlaveSecundaria(boolean esLlaveSecundaria) {
        this.esLlaveSecundaria = esLlaveSecundaria;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isEsLLave() {
        return esLLave;
    }

    public void setEsLLave(boolean esLLave) {
        this.esLLave = esLLave;
    }

    @Override
    public String toString() {
        int dato1 = esLLave ? 1 : 0;
        int dato2 = esLlaveSecundaria ? 1 : 0;
        return Nombre;
    }

    public String ParaGuardar() {
        int dato1 = esLLave ? 1 : 0;
        int dato2 = esLlaveSecundaria ? 1 : 0;
        return Nombre + "," + Tipo + "," + Tamano + "," + dato1 + "," + dato2;
    }
}
