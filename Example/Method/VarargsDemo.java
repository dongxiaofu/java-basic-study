public class VarargsDemo {
    private static int sumvarargs(int... varargs) {
        int sum = 0;
        /**
         * 不管可变参数是数组还是非数组，都可以如此遍历
         */
        for (int i = 0; i < varargs.length; i++) {
            sum += varargs[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = sumvarargs(new int[]{1, 2, 3, 4});
        System.out.println(sum);

        int sum2 = sumvarargs(1, 2, 3, 4, 5);
        System.out.println(sum2);
    }
}