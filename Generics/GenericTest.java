import java.util.*;

public class GenericTest {
    private static void getData(List<?> data) {
        System.out.println("data: " + data.get(0));
    }

    private static void getUpNumber(List<? extends Number> data) {
        System.out.println("data: " + data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(21);
        number.add(45);

        getData(name);
        getData(age);
        getData(number);

        // 错误: 不兼容的类型: List<String>无法转换为List<? extends Number>
//        getUpNumber(name);
        getUpNumber(age);
        getUpNumber(number);
    }
}