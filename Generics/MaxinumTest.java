public class MaxinumTest {
    //  错误: 非法的类型开始
//    private static <T extends <Comparable T>>
    private static <T extends Comparable<T>>
    T max(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d, %d 中最大的数是：%d", 1, 2, 3,
                max(1, 2, 3));
        System.out.printf("\n%.1f, %.1f, %.1f 中最大的数是：%.1f", 3.2, 5.9, 9.2,
                max(3.2, 5.9, 9.2));
        System.out.printf("\n%s, %s, %s 中最大的是：%s\n", 'A', 'B', 'C',
                max('A', 'B', 'C'));
    }
}