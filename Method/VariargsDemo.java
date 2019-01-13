public class VariargsDemo {
    public static void main(String[] args) {
        printMax(3, 4, 5, 90.2);
//        printMax(new Double() {3.4,3.9,7.0
//        });
        // varargs 不匹配; Double[]无法转换为double
        // printMax(new Double[]{5.2,5.7,5.2});
        printMax(new double[]{7.2,8.9,4.5});
        printMax(new double[]{});

    }

    private static void printMax(double... number) {
        if (number.length == 0) {
            System.out.println("no args");
            // 返回类型为void，使用 return;
            return;
        }

        double max;
        max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        System.out.println("max is " + max);
    }
}