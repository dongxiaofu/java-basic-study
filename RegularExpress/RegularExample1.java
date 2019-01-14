import java.util.regex.*;

public class RegularExample1 {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String[] args) {
        String content = "I am noob" +
                "from runnob.com";

        String pattern = ".*runnob.*";
        boolean isMatch = Pattern.matches(pattern, content);

        System.out.println("字符串是否包含了 'runnob' 字符串？" + isMatch);

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;

        System.out.println(m.find());

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }
}