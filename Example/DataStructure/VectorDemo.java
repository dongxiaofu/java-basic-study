import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(new String("P"));
        v.add(new String("M"));
        v.add(new String("L"));
        v.add(new String("K"));

        Collections.sort(v);

        int index = Collections.binarySearch(v, new String("K"));

        System.out.println("index:" + index);
    }
}