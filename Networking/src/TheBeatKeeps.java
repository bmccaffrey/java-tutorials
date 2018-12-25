public class TheBeatKeeps implements Runnable {
    public void run() {
        go();
    }
    public void go() {
        doStuff();
    }
    public void doStuff() {
        System.out.println("Top o' the Stack to ya!");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new TheBeatKeeps();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
