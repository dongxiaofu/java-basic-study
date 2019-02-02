import java.util.Collections;
import java.util.Vector;

public class SwapVector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");

        System.out.println(v);


        //        错误: 此处不允许使用 '空' 类型
        //        System.out.println(Collections.swap(v, 0, 4));

        Collections.swap(v, 0, 1);

        System.out.println(v);
    }
}