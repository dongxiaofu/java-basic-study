import java.util.*;

/**
 * subList(from, to)
 * 从0开始计数，from到to-1区间（包含）为结果
 */
public class SubListDemo {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<String>();
        llist.add("0");
        llist.add("1");
        llist.add("2");
        llist.add("3");
        llist.add("4");
        llist.add("5");
        llist.add("6");
        llit.add("7");
        llist.add("8");
        System.out.println(llist);
        llist.subList(3, 5).clear();
        System.out.println(llist);
    }
}