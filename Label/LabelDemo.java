/**
 * java语法 label
 * 完全没有弄明白
 */
public class LabelDemo {
    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();

        for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            testtbl2:
            while (length-- != 0) {
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    break testlbl;
                }
            }
            found = true;
            break;
        }
        testlbl:
        if (found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}