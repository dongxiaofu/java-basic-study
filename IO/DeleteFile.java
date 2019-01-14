import java.io.File;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DeleteFile {

    private static final String REGEX = ".*java";
    private static final String GIT = ".git";
    private static final String IDE = ".idea";

    public static void main(String[] args) {
        String dirname = args[0];
        File f = new File(dirname);
        deleteFolder(f);
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                String filename = file.getName();
                // 字符串的比较，不能使用 ==
//                if(filename == GIT || filename == IDE){
                if (filename.equals(GIT) || filename.equals(IDE)) {
                    System.out.println("不处理 " + filename);
                    continue;
                }

                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    boolean isMatch = Pattern.matches(REGEX, filename);
                    if (isMatch == false) {
                        System.out.println("删除 " + file.getName());
                        file.delete();
                    }
                }
            }
        }

//        System.out.println("删除 " + folder.getName());
//        folder.delete();
    }
}