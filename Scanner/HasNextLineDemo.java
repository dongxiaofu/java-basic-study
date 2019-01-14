import java.util.Scanner;

public class HasNextLineDemo {
    private static final String END = "end";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals(END)) {
                break;
            }
            System.out.println(s);
        }

        System.out.println("Over");
    }
}