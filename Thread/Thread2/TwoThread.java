public class TwoThread implements Runnable {
    public static void main(String[] args) {
        TwoThread runner = new TwoThread();
        Thread alpha = new Thread(runner);
        Thread belta = new Thread(runner);

        alpha.setName("Thread alpha");
        belta.setName("Thread belta");

        alpha.start();
        belta.start();
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("threadName: " + threadName);
        }
    }
}