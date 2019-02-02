import java.util.StringTokenizer;

/**
 * 使用 StringTokennizer 设置不同分隔符来分隔字符串，默认的分隔符
 * 是：空格、制表符（\t）、换行符(\n）、回车符（\r）
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "This is a string,written by Xiaoming,created by cg";

        StringTokenizer s1 = new StringTokenizer(str);

        while (s1.hasMoreElements()) {
            System.out.println(s1.nextElement());
        }

        System.out.println(".......................");

        StringTokenizer s2 = new StringTokenizer(str, ",");

        while (s2.hasMoreElements()) {
            System.out.println(s2.nextElement());
        }
    }
}