public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 9;

        System.out.println("交换前，num1 = " + num1 + "，num2 = " + num2);

        swap(num1, num2);

        System.out.println("交换后，num1 = " + num1 + ", num2 = " + num2);
    }

    private static void swap(int num1, int num2) {
        System.out.println("\t进入swap方法后");
        System.out.println("\t\t交换前，num1 = " + num1 + "，num2 = " + num2);

        int tmp = num2;
        num2 = num1;
        num1 = tmp;

        System.out.println("\t\t交换后，num1 = " + num1 + "，num2 = " + num2);
    }
}