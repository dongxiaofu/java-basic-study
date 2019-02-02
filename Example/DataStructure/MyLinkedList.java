import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        System.out.println(linkedList);

        linkedList.addFirst("0");
        System.out.println(linkedList);

        linkedList.addLast("4");
        System.out.println(linkedList);

        linkedList.subList(1,2).clear();
        System.out.println(linkedList);

        System.out.println("first:" + linkedList.getFirst());
        System.out.println("last:" + linkedList.getLast());
    }
}