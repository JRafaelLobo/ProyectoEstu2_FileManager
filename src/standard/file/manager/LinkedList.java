/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

/**
 *
 * @author 307000400
 */
public class LinkedList {
    private Nodo cabeza;

    public LinkedList() {
        this.cabeza = new Nodo(-1);
    }

    public Nodo getCabeza() {
        return this.cabeza;
    }
    
    public void add(int newSlot){
        Nodo newNodo = new Nodo(newSlot);
        newNodo.setSiguiente(this.cabeza);
        newNodo.setAnterior(null);
        cabeza.setAnterior(newNodo);

        this.cabeza = newNodo;
    }
     public void printList() {
        Nodo temp = cabeza;
        System.out.println("Lista doblemente enlazada:");
        while (temp != null) {
            System.out.print(temp.getSlot() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
    
    public void remove(int slotDelete){
        if(this.cabeza.getSlot() == -1){
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = this.cabeza;
        while (temp != null && temp.getSlot() != slotDelete){
            temp = temp.getSiguiente();
        }
        if (temp == null){
            System.out.println("La lista esta vacia");
            return;
        }
        
        if (temp.getAnterior() == null){
            this.cabeza = temp.getSiguiente();
        }else{
            temp.getAnterior().setSiguiente(temp.getSiguiente());
        }
        
        temp.getSiguiente().setAnterior(temp.getAnterior());
        
    }
}
