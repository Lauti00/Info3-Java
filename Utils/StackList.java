package Utils;

public class StackList<Anytype> {

    private Nodo<Anytype> tos = null;

    public StackList() {
        this.tos = tos;

    }

    //Agrego el elemento a la pila
    public void push(Anytype element) {
        Nodo<Anytype> newNodo = new Nodo<>(element);
        newNodo.next = tos; //la cima
        tos = newNodo; //La cima es igual al nuevo nodo
    }

    //Elimino el ultimo valor
    public Anytype pop() {
        Anytype element = tos.data;
        tos =  tos.next;
        return element;
    }

    //Retorno el ultimo valor
    public Anytype top() {
        return tos.data;
    }

    public boolean isEmpty() {
        return this.tos == null ? true : false;
    }

    public void makeEmpty() {
        this.tos = null;
    }

    public int size() {
        int count = 0;

        Nodo<Anytype> actual = tos;
        while (actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }

    public void print() {
        Nodo<Anytype> current = tos;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
