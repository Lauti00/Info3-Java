/*Ordenar una Cola:
a. Implementa un programa que ordene los elementos de una cola en
orden ascendente (o descendente).
b. Crear una función ordenarColaAscendente toma una cola de enteros
como entrada y utiliza una cola auxiliar (colaAuxiliar) para ordenar los
elementos de la cola original en orden ascendente. Los elementos se
desencolan de la cola original y se insertan en la cola auxiliar de
manera que siempre se mantenga el orden correcto.
c. Luego, se copian los elementos ordenados de la cola auxiliar a la cola
original, y la cola original queda ordenada en orden ascendente.
d. La salida del programa mostrará la cola original y la cola ordenada en
orden ascendente.*/
package PilasYcolas;
import Utils.Queue;

public class Cola {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(80);
        queue.enqueue(1);
        queue.enqueue(3);

        System.out.println("Imprimiendo cola...");
        queue.print();

        colaAscendente(queue);

    }

    public static void colaAscendente(Queue<Integer> queue) {
        Queue<Integer> queueAuxiliar = new Queue<Integer>(5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Descolando...");
        queue.print();

        queueAuxiliar.enqueue(80);
        queueAuxiliar.enqueue(20);
        queueAuxiliar.enqueue(10);
        queueAuxiliar.enqueue(3);
        queueAuxiliar.enqueue(1);
        System.out.println("Cola auxiliar....");
        queueAuxiliar.print();

    }
}
