public class ReverseDemo {
    public static void main(String[] args) {
        String str = "cg";
        String reverse;

        reverse = new StringBuffer(str).reverse().toString();

        System.out.println("Before: " + str);
        System.out.println("After: " + reverse);
    }
}