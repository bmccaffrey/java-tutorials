public class MyRunnable implements Runnable {
    public void run() {
        go();
    }
    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doStuff();
    }
    public void doStuff() {
        System.out.println("Top o' the Stack to ya!");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
