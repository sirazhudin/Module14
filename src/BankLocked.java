public class BankLocked {
    private int money =10000;
    private Object lock = new Object ();

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (lock) {
            if (getMoney ()>=1000)
            this.money -= money;
        }
    }

    void repay(int money) {
        synchronized (lock ) {
            if(getMoney ()<=9000)
            this.money += money;
        }
    }
    class ClientLock extends Thread {
        @Override
        public void run() {
            while (true) {
                take ( 1000 );
                repay ( 1000 );
            }
        }
    }
    public BankLocked () {
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
        new ClientLock ().start ();
    }

    public static void main(String[] args) throws InterruptedException {
        BankLocked bankLocked = new BankLocked ();
        while (true) {
            System.out.println ( bankLocked.money );
            Thread.sleep ( 500 );
        }
    }
}
