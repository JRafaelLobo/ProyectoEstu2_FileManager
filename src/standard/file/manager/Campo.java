package standard.file.manager;

public class Campo {

    private String Nombre, Tipo;
    private int Tamano;
    private boolean esLLave;

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
    }

    public Campo(String Nombre, String Tipo, int Tamano, boolean esLLave) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Tamano = Tamano;
        this.esLLave = esLLave;
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
        return Nombre + "," + Tipo + "," + Tamano + "," + esLLave;
    }

}
