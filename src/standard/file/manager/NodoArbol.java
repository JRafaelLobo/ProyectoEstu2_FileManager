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
     * Este metodo se utiliza para Ingresar una llave al arbol con el id(El plan
     * que tengo es crear un objeto especifico para la llave
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public boolean Insertar(Llave dato) {
        return true;
    }

    public boolean Eliminar(Llave dato) {
        return true;
    }

    public int Buscar(String llave) {
        return -1;
    }

    public NodoArbol getArbol() {
        if (this.padre == null) {
            return this;
        }
        return this.padre.getArbol();
    }

    //Metodos para que funciones
    public void addHijo(NodoArbol N) {
        hijos.add(N);
    }

    public NodoArbol GetHijo(int n) {
        return hijos.get(n);
    }

    public void setRaiz(Llave N) {
        if (this.getPadre() != null) {
            if (this.getPadre().getHijos().size() < T - 1) {
                this.getPadre().llaves.add(N);
                Collections.sort(this.getPadre().llaves, Comparator.comparing(Object::toString));
            } else {
                this.getPadre().llaves.add(N);
                Collections.sort(this.getPadre().llaves, Comparator.comparing(Object::toString));
                this.getPadre().split();
            }
            return;
        }
        Collections.sort(this.llaves, Comparator.comparing(Object::toString));
        NodoArbol R = new NodoArbol(T);
        R.getHijos().add(this);
        this.setPadre(R);
        setRaiz(N);

        //falta codigo
    }

    private void split() {
        Collections.sort(this.llaves, Comparator.comparing(Object::toString));
        Llave medio = this.llaves.get((int) (this.llaves.size() / 2));
        this.setRaiz(medio);
        this.llaves.remove(medio);

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

    public void setHijos(ArrayList<NodoArbol> hijos) {
        this.hijos = hijos;
    }

    public NodoArbol getPadre() {
        return padre;
    }

    private void setPadre(NodoArbol padre) {
        this.padre = padre;
    }

    public ArrayList<Llave> GetLlaves() {
        return llaves;
    }

    public void setLLaves(ArrayList<Llave> llaves) {
        this.llaves = llaves;
    }

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
