public class MyRunnable implements Runnable {
    private void doMore() {
        System.out.println("MyRunnable");
    }

    private void go() {
        doMore();
    }

    public void run() {
        go();
    }
}