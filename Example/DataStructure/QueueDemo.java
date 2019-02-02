import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println("===========");

        System.out.println("poll = " + queue.poll());
        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println("element = " + queue.element());
        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println("peek = " + queue.peek());
        for (String element : queue) {
            System.out.println(element);
        }
    }
}