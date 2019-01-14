import java.util.Scanner;

public class HasNextDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hasNext输入方式");

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("q")) {
                break;
            }
            System.out.println(s);
        }

        scanner.close();
    }
}