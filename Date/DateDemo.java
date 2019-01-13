import java.util.Date;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("date:" + date.toString());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("It's " + ft.format(dNow));

        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.println(input);

        System.out.println(input + " Parses as ");

        Date t;

        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");

        // 未结束的字符文字
        // SimpleDateFormat ft2 = new SimpleDateFormat('yyyy-MM-dd');
        // 不能格式化 1818-11-11 这种类型数据
        // SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        try {
            t = ft2.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft2);
        }
    }
}