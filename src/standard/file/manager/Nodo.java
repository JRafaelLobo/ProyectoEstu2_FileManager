/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

/**
 *
 * @author 307000400
 */
public class Nodo {
    private Object slot;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(Object slot){
        this.slot = slot;
        this.anterior =  null;
        this.siguiente = null;
    }

    public Object getSlot() {
        return this.slot;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public Nodo getAnterior() {
        return this.anterior;
    }

    public void setSlot(Object slot) {
        this.slot = slot;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
