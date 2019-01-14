public class GenericMethodTest {
    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // 错误
//        int[] intArr = {1, 2, 3, 4};
//        double[] doubleArr = {1.0, 2.0, 3.0, 4.0};
//        char[] charArr = {'H', 'E', 'L', 'L', 'O'};

        Integer[] intArr = {1, 2, 3, 4};
        Double[] doubleArr = {1.0, 2.0, 3.0, 4.0};
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("输出整型数组：");
        printArray(intArr);

        System.out.println("\n输出双精度型数组：");
        printArray(doubleArr);

        System.out.println("\n输出字符型数组");
        printArray(charArr);
    }
}