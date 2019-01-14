public class Cake extends Object {
    private int id;

    public Cake(int id) {
        id = id;
        System.out.println("Cake Object " + id + " is created");
    }

    // 警告: [deprecation] Object中的finalize()已过时
    //  javac FinalizationDemo.java  -Xlint:deprecation
    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + " is disposed");
    }
}