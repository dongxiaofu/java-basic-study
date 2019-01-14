import java.io.*;

public class WriteDemo {
    public static void main(String[] args) {
        int b;
        //  错误: 不兼容的类型: String无法转换为int
        // b = "A";
        //  错误: 未结束的字符文字
        // b = 'AZ';
        b = 122;
        System.out.write(b);
        System.out.println(b);
        System.out.println('\n');
    }
}