/**
 * 两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较；如果两个字符数组的长度不一样，并且较短的数
 * 组和较长数组所有对应位置的字符都相同，则返回两个数组的长度之差。
 */
public class StringCompareEmp {
    public static void main(String[] args){
        String str = "Hello world";
        String anotherStr = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotherStr));
        System.out.println(str.compareToIgnoreCase(anotherStr));
        System.out.println(str.compareTo(objStr.toString()));
        System.out.println(str.compareTo("Hello"));
    }
}