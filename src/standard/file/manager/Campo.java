package standard.file.manager;
public class Campo {
    private String Nombre;
    private int Tamano,Tipo;
    /*tipos
    1:int
    2:String
    3:double o float
    4:caracter
    */

    public Campo(String Nombre, int Tamano, int Tipo) {
        this.Nombre = Nombre;
        this.Tamano = Tamano;
        this.Tipo = Tipo;
    }
    
}
