package standard.file.manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * La clase {@code NodoArbol}
 *
 *
 * <p>
 * Este es los nodos individuales de cada arbol, Si quieres el arbol completo
 * solo ocupas obtener la raiz total
 * </p>
 *
 *
 * @author Rafael
 * @version xd
 * @since 2023-12-3
 */
public class NodoArbol implements Serializable {

    private ArrayList<NodoArbol> hijos = new ArrayList();
    private NodoArbol padre;
    private ArrayList<Llave> llaves = new ArrayList();
    private int T;
//T=6

    /**
     * Este metodo se usa mayormente para crear un arbol nuevo ya que no se
     * ingresa cual es su padre
     *
     *
     * @param orden del arbol T= mayor grado
     *
     */
    public NodoArbol(int T) {
        this.T = T;
    }

    public NodoArbol(NodoArbol padre, int T) {
        this.padre = padre;
        this.T = T;
        this.padre.addHijo(this);
    }
//Metodos Importantes

    /**
     * Este metodo se utiliza para Ingresar una llave al arbol
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public boolean Insertar(Llave dato) {
        return false;
    }

    /**
     * Este metodo se utiliza para eliminar una llave al arbol
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public boolean Eliminar(Llave dato) {
        return false;
    }

    /**
     * Este metodo se utiliza para buscar una llave al arbol y retorna el rnn
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public int Buscar(String llave) {
        return -1;
    }

    /**
     * Este metodo se utiliza para obtener el nodo que tiene todo desde un
     * subnodo
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public NodoArbol getArbol() {
        if (this.padre == null) {
            return this;
        }
        return this.padre.getArbol();
    }

    //Metodos para que funciones
    private void addHijo(NodoArbol N) {
        hijos.add(N);
    }

    private NodoArbol GetHijo(int n) {
        return hijos.get(n);
    }

    private void setRaiz(Llave N) {

        if (this.getPadre().getHijos().size() < T - 1) {
            this.getPadre().llaves.add(N);
            Collections.sort(this.getPadre().llaves, Comparator.comparing(Object::toString));
        } else {
            if (this.getPadre() != null) {
                this.getPadre().llaves.add(N);
                Collections.sort(this.getPadre().llaves, Comparator.comparing(Object::toString));
                this.getPadre().split();
                return;
            }
            Collections.sort(this.llaves, Comparator.comparing(Object::toString));
            NodoArbol R = new NodoArbol(T);
            R.getHijos().add(this);
            this.padre = R;
            setRaiz(N);
        }

        //falta codigo
    }

    private void split() {
        Collections.sort(this.llaves, Comparator.comparing(Object::toString));
        Llave medio = this.llaves.get((int) (this.llaves.size() / 2));
        this.setRaiz(medio);
        NodoArbol NA = new NodoArbol(this.padre, T);
        for (int i = ((int) this.llaves.size() / 2); i < this.llaves.size(); i++) {
            NA.GetLlaves().add(this.llaves.get(i));
            this.llaves.remove(i);
        }
        Collections.sort(NA.GetLlaves(), Comparator.comparing(Object::toString));
        //Creacion del nuevo nodo
    }

    private void merch() {

    }

    private void EliminarNodo() {
        this.padre.getHijos().remove(this);
    }

    //getter y setters
    private ArrayList<NodoArbol> getHijos() {
        return hijos;
    }

    private NodoArbol getPadre() {
        return padre;
    }

    /**
     * Favor no utilizar este metodo
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si es hoja
     */
    public void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    /**
     * Favor no utilizar este metodo
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si es hoja
     */
    public ArrayList<Llave> GetLlaves() {
        return llaves;
    }

    /**
     * Este metodo verifica si el nodo actual es hoja
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si es hoja
     */
    public boolean EsHoja() {
        if (hijos.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean compararAlfabeticamente(String menor, String mayor) {
        // Retorna true cuando cadena 2 es mayor
        int resultado = menor.compareTo(mayor);

        if (resultado < 0) {
            return true;
        } else if (resultado > 0) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return llaves.get(llaves.size() - 1).toString();
    }

}
