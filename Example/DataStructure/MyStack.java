import java.util.LinkedList;

public class MyStack {
    private LinkedList list = new LinkedList();

    private void push(Object element) {
        list.addFirst(element);
    }

    private Object top() {
        return list.getFirst();
    }

    private Object pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        for (int i = 0; i < 100; i++) {
            stack.push(new Integer(i));
        }

        System.out.println(stack.pop());
        System.out.println(stack.top());

        stack.push(new Integer(102));

        System.out.println(stack.top());
    }
}