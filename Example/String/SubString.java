public class SubString {
    private static String removeCharAt(String s, int pos) {
        String string;
        string = s.substring(0, pos) + s.substring(pos + 1);

        return string;
    }

    public static void main(String[] args) {
        int pos = Integer.parseInt(args[0]);
        String string = "This is java";
        String newStr = removeCharAt(string, pos);
        System.out.println(newStr);
    }
}