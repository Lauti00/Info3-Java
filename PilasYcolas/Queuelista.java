
package Practico4;
import Utils.QueueList;

public class Queuelista {
    public static void main(String[] args) {
        QueueList<Integer>queuelist = new QueueList<>();
        queuelist.enqueue(20);
        queuelist.enqueue(30);
        queuelist.enqueue(2);
        
        
        System.out.println(queuelist.dequeue());
        System.out.println(queuelist.dequeue());
        System.out.println(queuelist.dequeue());
        
    }
}
