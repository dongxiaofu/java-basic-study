public class SplitDemo {
    public static void main(String[] args) {
        String str = "www.google.com";
//        String delimeter = ".";
        String delimeter = "\\.";
        String[] strArr = str.split(delimeter);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
            System.out.println("");
        }

        System.out.println("..........for each..........");

        String str2 = "www-google-com";
        String[] tmp2;
        String delimeter2 = "-";
        tmp2 = str2.split(delimeter2);
        for (String element:tmp2) {

            System.out.println(element);
            System.out.println("");
        }
    }
}