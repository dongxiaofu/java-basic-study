import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String dirname = args[0];
        File f = new File(dirname);
        deleteFolder(f);
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    System.out.println("删除 " + file.getName());
                    file.delete();
                }
            }
        }

        System.out.println("删除 " + folder.getName());
        folder.delete();
    }
}