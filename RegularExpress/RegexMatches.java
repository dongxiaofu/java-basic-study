import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "ooooofoooooooooooo";

    private static Pattern pattern2;
    private static Matcher matcher;
    private static Matcher matcher2;

    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d*)(.*)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Founded.value: " + m.group(0));
            System.out.println("Founded.value: " + m.group(1));
            System.out.println("Founded.value: " + m.group(2));
            System.out.println("Founded.value: " + m.group(3));
        }

        pattern2 = Pattern.compile(REGEX);
        matcher = pattern2.matcher(INPUT);
        matcher2 = pattern2.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
        System.out.println("lookingAt(): " + matcher2.lookingAt());
    }
}