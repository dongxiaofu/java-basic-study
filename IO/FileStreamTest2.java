import java.io.*;

/**
 * IO操作必须放入try...catch中，否则会报错。
 */
public class FileStreamTest2 {
    private static final String FILENAME = "FileStreamTest2.txt";

    public static void main(String[] args) {
        try {
            File f = new File(FILENAME);
            FileOutputStream fop = new FileOutputStream(f);

            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

            writer.append("中文输入");
            writer.append("\r\n");
            writer.append("你好");
            writer.append("\r\n");
            writer.append("English Input");
            writer.append("\r\n");
            writer.append("hello");

            writer.close();
            fop.close();

            FileInputStream fip = new FileInputStream(f);

            InputStreamReader reader = new InputStreamReader(fip, "UTF-8");

            StringBuffer sb = new StringBuffer();

            while (reader.ready()) {
                sb.append((char) reader.read());
            }

            reader.close();
            fip.close();

            System.out.println(sb);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}