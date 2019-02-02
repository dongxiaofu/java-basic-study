import java.util.LinkedList;

public class ModifyLinkedList {
    public static void main(String[] args) {
        LinkedList officers = new LinkedList();
        officers.add("A");
        officers.add("B");
        officers.add("C");
        officers.add("D");
        officers.add("E");

        System.out.println(officers);

        officers.set(2, "A");

        System.out.println(officers);
    }
}