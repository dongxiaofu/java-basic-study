public class Test
{
    public static void main(String[] args)
    {
        StringBuffer sBuffer = new StringBuffer("学习java");
        sBuffer.append(" www");
        sBuffer.append(".baidu.com");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        sBuffer.reverse();
        System.out.println(sBuffer);
    }
}