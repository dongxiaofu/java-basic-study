public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int limit = 100;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= limit);

        System.out.println("sum = " + sum);
    }
}