public class StringDemo
{
    public static void main(String args[])
    {
        char[] helloArray = {'e','r','i','c'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        int len = helloString.length();
        System.out.println("length:" + len);
        String fullname = "My full name is".concat(" eric");
        System.out.println(fullname);
        System.out.println("Hello," + "world" + "!");
    }
}