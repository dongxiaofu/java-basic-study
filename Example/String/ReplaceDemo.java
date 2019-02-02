public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "Hello, world";
        System.out.println(str.replace("H", "W"));
        System.out.println(str.replaceFirst("o", "A"));
        System.out.println(str.replaceAll("o", "A"));
    }
}