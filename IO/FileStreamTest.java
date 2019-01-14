import java.io.*;

public class FileStreamTest {
    private static final String FILENAME = "FileStreamTest.txt";

    public static void main(String[] args) {
        try {
            byte[] bWrite = {96, 97, 98, 40, 123};
            //  错误: OutputStream是抽象的; 无法实例化
            // OutputStream os = new OutputStream(FILENAME);
            OutputStream os = new FileOutputStream(FILENAME);
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            //  错误: InputStream是抽象的; 无法实例化
            // InputStream is = new InputStream(FILENAME);
            FileInputStream is = new FileInputStream(FILENAME);
            int size = is.available();

            for (int i = 0; i < size; i++) {
//                System.out.println(is.read());
//                System.out.println(":");
                System.out.println((char) is.read());
            }
            is.close();

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}