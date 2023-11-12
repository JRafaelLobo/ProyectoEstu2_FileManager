package standard.file.manager;

public class Campo {

    private String Nombre, Tipo;
    private int Tamano;

    /*tipos
    1:int
    2:double o float
    3:caracter
     */
    public Campo(String Nombre, int Tamano, String Tipo) {
        this.Nombre = Nombre;
        this.Tamano = Tamano;
        this.Tipo = Tipo;
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

    public Object getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return Nombre + ": " + Tipo + "[" + Tamano + "]";
    }

}
