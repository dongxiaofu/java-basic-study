public class TestThread {
    public static void main(String[] args) {
        // 错误: 找不到符号
//        MyRunnable myRunnable = new MyRunnable();
       MyRunnable myRunnable = new MyRunnable();
       Thread t = new Thread(myRunnable);
       t.start();

//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        System.out.println("I'm in TestThread");
    }
}