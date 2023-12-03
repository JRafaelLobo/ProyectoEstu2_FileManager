package standard.file.manager;

/**
 *
 * @author 307000400
 */
public class LinkedList {

    private Nodo cabeza;
    private Nodo last;

    public LinkedList() {
        this.cabeza = this.last = new Nodo(-1);
    }

    public Nodo getCabeza() {
        return this.cabeza;
    }

    public Nodo getLast() {
        return this.last;
    }
    

    public void addForConstruction(int newSlot) {
        if (newSlot < 0) {
            return;
        }
        if (this.cabeza.getSlot() == -1) {
            this.add(newSlot);
            return;
        }
        Nodo newNodo = new Nodo(newSlot);
        Nodo temp = this.last;

        temp.getAnterior().setSiguiente(newNodo);
        temp.getAnterior().getSiguiente().setAnterior(temp.getAnterior());
        temp.getAnterior().getSiguiente().setSiguiente(temp);
        temp.setAnterior(temp.getAnterior().getSiguiente());

    }

    public void add(int newSlot) {
        if (newSlot < 0) {
            return;
        }
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
        Nodo temp2 = last;
        while (temp2 != null) {
            System.out.print(temp2.getSlot() + " ");
            temp2 = temp2.getAnterior();
        }
        System.out.println();
    }

    public void remove(int slotDelete) {
        if (this.cabeza.getSlot() == -1) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo temp = this.cabeza;
        while (temp != null && temp.getSlot() != slotDelete) {
            temp = temp.getSiguiente();
        }
        if (temp == null) {
            System.out.println("La lista esta vacia");
            return;
        }

        if (temp.getAnterior() == null) {
            this.cabeza = temp.getSiguiente();
        } else {
            temp.getAnterior().setSiguiente(temp.getSiguiente());
        }

        temp.getSiguiente().setAnterior(temp.getAnterior());

    }
}
