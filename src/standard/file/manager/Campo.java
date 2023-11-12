package standard.file.manager;

public class Campo {

    private String Nombre;
    private int Tamano, Tipo;

    /*tipos
    1:int
    2:double o float
    3:caracter
     */
    public Campo(String Nombre, int Tamano, int Tipo) {
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

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public String toString() {
        String tipo;
        switch (Tipo) {
            case 1:
                tipo = "int";
                break;
            case 2:
                tipo = "double";
                break;
            case 3:
                tipo = "char";
                break;
            case 4:
                tipo = "String";
                break;
            default:
                tipo = "Unknown";
        }
        return Nombre + ": " + tipo +"["+Tamano+"]";
    }

}
