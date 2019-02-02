/**
 * 如果设置第一个参数为 true ，则表示忽略大小写区别。
 */
public class StringRegionMatch {
    public static void main(String[] args) {
        String str1 = "I like China";
        String str2 = "He like china";

        Boolean match1 = str1.regionMatches(7, str2, 8, 5);
        System.out.println(match1);

        Boolean match2 = str1.regionMatches(true, 7, str2, 8, 5);
        System.out.println(match2);
    }
}