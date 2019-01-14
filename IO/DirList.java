import java.io.File;

/**
 * scanDir使用了递归
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "test";
        scanDir(dirname);
    }

    private static void scanDir(String dir) {
        File f1 = new File(dir);
        if (f1.isDirectory()) {
            System.out.println(dir + " 是一个目录");
            String[] s = f1.list();
            for (int i = 0; i < s.length; i++) {
                scanDir(dir + "/" + s[i]);
            }
        } else {
            System.out.println(dir + " 是一个文件");
        }
    }
}