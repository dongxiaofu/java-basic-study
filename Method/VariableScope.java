public class VariableScope {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        /**
         * i 的作用域是整个循环体
         * j 的作用域是声明它的地方到循环体结束。
         * 和PHP是不同的。
         */
        for (int i = 0; i < SIZE; i++) {
            if (i == 5) {
                System.out.println("set j");
                int j = 50;
                System.out.println("j is " + j);
            }
            System.out.println("i is " + i);
        }

        //  错误: 找不到符号
        // System.out.println("i is " + i);
        // System.out.println("j is " + j);
    }
}