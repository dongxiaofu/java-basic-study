public class TestVoidMethod
{
    public static void main(String[] args)
    {
        printGade(99.3);
        printGade(40);
    }


    // 错误: 无法从静态上下文中引用非静态 方法 printGade(double)
    //    public void printGade(double score)
    private static void printGade(double score)
    {
        if(score > 90.0){
            System.out.println('A');
        }else if(score > 80.0){
            System.out.println("B");
        }else if(score > 70.0){
            System.out.println('C');
        }else if(score > 60.0){
            System.out.println('D');
        }else{
            System.out.println('E');
        }
    }
}