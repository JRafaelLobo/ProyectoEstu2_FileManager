package standard.file.manager;
public class Campo {
    public String Nombre;
    public int Tamano;
    public Object Tipo;
    /*tipos
    1:int
    2:String
    3:double o float
    4:caracter
    */

    public Campo(String Nombre, int Tamano, Object Tipo) {
        this.Nombre = Nombre;
        this.Tamano = Tamano;
        this.Tipo = Tipo;
    }
    
}
