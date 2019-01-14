import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "test/a/b";
        File f = new File(dirname);
        f.mkdirs();
    }
}