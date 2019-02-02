public class SearchLastString {
    public static void main(String[] args) {
        String string = "Hello, world.Hello,cg!";
        int lastIndex = string.lastIndexOf("H");
        System.out.println("lastIndex: " + lastIndex);
        if (lastIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found. In " + lastIndex);
        }

        int lastIndex2 = string.lastIndexOf("M");
        System.out.println("lastIndex2 :" + lastIndex2);
    }
}