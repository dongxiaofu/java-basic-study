import java.util.Collections;
import java.util.Vector;

public class VectorMax {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new Double("3.5"));
        v.add(new Double("4.9"));
        v.add(new Double("9.3"));

        System.out.println("max: " + Collections.max(v));
    }
}