public class TestArray {
    public static void main(String[] args) {
        int size = 5;
        double[] myList = new double[size];
        myList[0] = 1.0;
        myList[1] = 2.0;
        myList[2] = 3.0;

        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }

        System.out.println("total " + total);

        double[] myList2 = {1.0, 2.0, 3.0};
        for (int i = 0; i < myList2.length; i++) {
            System.out.println("myList2[" + i + "] is " + myList2[i]);
        }

        double max = myList2[0];
        for (int i = 1; i < myList2.length; i++) {
            if (myList2[i] > max) {
                max = myList2[i];
            }
        }
        System.out.println("max is " + max);

        for (double element : myList) {
            System.out.println(element);
        }
    }
}