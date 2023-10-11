
package PilasYcolas;

import Utils.Queue;
import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresando los datos...");
        //cargo valores
        queue.enqueue(3);
        queue.enqueue(6);

        //elimino
        queue.dequeue();

        System.out.println(queue.dequeue());

    }

}
