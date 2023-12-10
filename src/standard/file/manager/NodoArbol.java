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

    //
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
        if (this.EsHoja()) {
            this.llaves.add(dato);
            if (this.llaves.size() >= T - 1) {
                this.split();
            }
            return true;
        }
        for (int i = 0; i < this.llaves.size(); i++) {
            if (compararAlfabeticamente(dato.toString(), this.llaves.get(i).toString())) {
                return this.hijos.get(i).Insertar(dato);
            }
        }
        if (compararAlfabeticamente(this.llaves.get(this.llaves.size() - 1).toString(), dato.toString())) {
            return this.hijos.get(this.llaves.size()).Insertar(dato);
        }
        return false;
    }

    /**
     * Este metodo se utiliza para eliminar una llave al arbol
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public boolean Eliminar(Llave dato) {
        for (int i = 0; i < this.llaves.size(); i++) {
            if (this.llaves.get(i).toString().equals(dato)) {
                this.llaves.remove(i);
                if (this.llaves.size() < (T - 1) / 2) {
                    this.merch();
                }
            }
            if (compararAlfabeticamente(dato.toString(), this.llaves.get(i).toString())) {
                return this.GetHijo(i).Eliminar(dato);
            }
        }
        if (compararAlfabeticamente(this.llaves.get(this.llaves.size() - 1).toString(), dato.toString())) {
            return this.hijos.get(this.llaves.size()).Eliminar(dato);
        }
        return false;
    }

    /**
     * Este metodo se utiliza para buscar una llave al arbol y retorna el rnn
     *
     * @param Revisar la descripcion de la Clase Llave
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public int Buscar(String llave) {
        for (int i = 0; i < this.llaves.size(); i++) {
            if (this.llaves.get(i).toString().equals(llave)) {
                return this.llaves.get(i).getRnn();
            }
            if (compararAlfabeticamente(llave.toString(), this.llaves.get(i).toString())) {
                return this.GetHijo(i).Buscar(llave);
            }
        }
        if (compararAlfabeticamente(this.llaves.get(this.llaves.size() - 1).toString(), llave.toString())) {
            return this.hijos.get(this.llaves.size()).Buscar(llave);
        }
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
        this.padre.addHijo(NA);

        if (!this.EsHoja()) {
            for (int i = this.GetLlaves().size() + 1; i < this.getHijos().size(); i++) {
                NA.addHijo(this.GetHijo(i));
                this.getHijos().remove(i);
            }
        }
        //No es necesario
        Collections.sort(NA.GetLlaves(), Comparator.comparing(Object::toString));

        //Creacion del nuevo nodo
    }

    private void merch() {
        ArrayList<NodoArbol> HijosDePadre = this.padre.getHijos();
        NodoArbol NodoACombinar;
        int yo = QueHijoSoy();
        int T1 = -1, T2 = -1, num = -1;
        if (HijosDePadre.size() <= yo + 1) {
            T2 = HijosDePadre.get(yo + 1).GetLlaves().size();
        }
        if (yo != 0) {
            T1 = HijosDePadre.get(yo - 1).GetLlaves().size();
        }
        if (T1 < T2) {
            NodoACombinar = HijosDePadre.get(T1);
            num = T1;
        } else {
            NodoACombinar = HijosDePadre.get(T2);
            num = T2 - 1;
        }
        if (this.EsHoja()) {
            for (int i = 0; i < NodoACombinar.GetLlaves().size(); i++) {
                this.llaves.add(NodoACombinar.GetLlaves().get(i));

            }
            this.llaves.add(this.padre.llaves.get(num));
            this.padre.llaves.remove(num);
            this.padre.hijos.remove(NodoACombinar);
            if (this.llaves.size() >= (T + 1 / 2)) {
                this.split();
            }
        }
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
        return hijos.isEmpty();
    }

    private int QueHijoSoy() {
        for (int i = 0; i < this.padre.getHijos().size(); i++) {
            if (this.padre.getHijos().get(i) == this) {
                return i;
            }
        }
        return -1;
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
