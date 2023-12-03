package standard.file.manager;

/**
 * La clase {@code Llave}
 *
 *
 * <p>
 * Esta clase es la que se utiliza para enviar datos a la arbol
 * </p>
 *
 * 
 * 
 *
 * @author Rafael
 * @version  xd
 * @since 2023-12-3
 */
public class Llave {

    private String nombre;
    private int rnn;

    /**
     * Construtor de la llave
     * 
     *
     * @param El nombre de la llave
     * @param el rnn o el numero de registro
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public Llave(String nombre, int rnn) {
        this.nombre = nombre;
        this.rnn = rnn;
    }

    public String getId() {
        return nombre;
    }

    public void setId(String id) {
        this.nombre = id;
    }

    public int getRnn() {
        return rnn;
    }

    public void setRnn(int rnn) {
        this.rnn = rnn;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
