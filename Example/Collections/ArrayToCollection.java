import java.util.*;
import java.io.*;

public class ArrayToCollection {
    public static void main(String[] args) {
        int n = 5;
        String[] name = new String[n];

        int i = 0;
        while (i < n) {
            name[i] = String.valueOf(i);
            i++;
        }

        List<String> list = Arrays.asList(name);

        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}