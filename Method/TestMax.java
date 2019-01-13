public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int max = max(5, 10);
        System.out.println("max is " + max);

        double i2 = 5.2;
        double j2 = 7.9;
        double max2 = max(i2, j2);
        System.out.println("max is " + max2);
    }

    private static int max(int num1, int num2) {
        int result;

        System.out.println("int");

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }

    private static double max(double num1, double num2)
    {
        double result;

        System.out.println("double");

        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }
}