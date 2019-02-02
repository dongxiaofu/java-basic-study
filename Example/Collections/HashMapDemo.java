import java.util.*;
import java.util.Map.Entry;

//import java.util.Map;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("1", "1th");
        hMap.put("2", "2th");
        hMap.put("3", "3th");

        Collection cl = hMap.values();
        Iterator itr = cl.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        printDelimeter();

        strongForMethod2(hMap);

        printDelimeter();

        strongForMethod1(hMap);

        printDelimeter();

        traditionalMethod2(hMap);

        printDelimeter();

        tradtionalMetho1(hMap);
    }

    private static void printDelimeter() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("%s", "=");
        }

        System.out.println();
    }

    private static void strongForMethod2(Map<String, String> maps) {
        Set<Entry<String, String>> sets = maps.entrySet();
        for(Entry<String, String>entry : sets){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key = %s, value = %s\n", key, value);
        }
    }

    private static void strongForMethod1(Map<String, String> maps) {
        Set<String> sets = maps.keySet();
        for (String s : sets) {
            String key = s;
            String value = maps.get(key);
            System.out.printf("key = %s, value = %s\n", key, value);
        }
    }

    private static void traditionalMethod2(Map<String, String> maps) {
        Set<Entry<String, String>> sets = maps.entrySet();
        Iterator<Entry<String, String>> iterator = sets.iterator();

        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key = %s, value = %s\n", key, value);
        }
    }

    private static void tradtionalMetho1(Map<String, String> maps) {
        Set<String> keys = maps.keySet();

        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = maps.get(key);
            System.out.printf("key = %s, value = %s\n", key, value);
        }
    }


}