class BankAccount {
    private int balance = 100;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

public class RyanAndMonica implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonica job = new RyanAndMonica();
        Thread one = new Thread(job);
        Thread two = new Thread(job);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch(InterruptedException ex) { ex.printStackTrace(); }
            System.out.println(Thread.currentThread().getName() + " is awake");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " has completed the withdrawal");
        } else {
            System.out.println("Sorry, " + Thread.currentThread().getName() + ", insufficient funds");
        }
    }
}
