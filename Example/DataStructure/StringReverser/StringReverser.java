public class StringReverser {
    private String input;
    private String output;

    public StringReverser(String input) {
        this.input = input;
        output = "";
    }

    private String doRev() {
        int length = input.length();
        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        return output;
    }

    public static void main(String[] args) {
        String input = "163.com";
        StringReverser stringReverser = new StringReverser(input);
        String output = stringReverser.doRev();

        System.out.println("input: " + input);
        System.out.println("output: " + output);
    }

}