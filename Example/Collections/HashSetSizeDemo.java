import java.util.*;

public class HashSetSizeDemo {
    public static void main(String[] args) {
        HashSet collection = new HashSet();
        String str1 = "red", str2 = "white", str3 = "black", str4 = "yellow", str5 = "blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        collection.add(str5);

        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        int size = collection.size();
        if (collection.isEmpty()) {
            System.out.println("collection is empty");
        } else {
            System.out.println("size :" + collection.size());
        }
    }
}