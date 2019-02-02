import java.util.*;

public class CollectionShuffleDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }

        System.out.println("打乱前：");
        System.out.println(list);

        System.out.println("打乱后：");

        for (int i = 0; i < 6; i++) {
            System.out.printf("第 %d 次打乱：", (i + 1));
//            System.out.println("第%d次打乱：" + i);
            Collections.shuffle(list);
            System.out.println(list);
        }
    }
}