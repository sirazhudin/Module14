public class Bank {
    static int money = 10000;
    ;

    static synchronized void takeMoney(int money) {
        Bank.money -= money;
    }

    static synchronized void returnMoney(int money) {
        Bank.money += money;
    }

    static int getMoney() {
        return money;
    }

    static class Client extends Thread {
        @Override
        public void run() {
            while (true) {
                takeMoney ( 1000 );
                returnMoney ( 1000 );
            }
        }
    }

   // public Bank() {
     //   new Client ( ).start ( );
       // new Client ( ).start ( );
        //new Client ( ).start ( );
        //new Client ( ).start ( );
    //}

    public static void main(String[] args) throws InterruptedException {
        //Bank bank = new Bank ( );
        new Client ( ).start ( );
        new Client ( ).start ( );
        new Client ( ).start ( );
        new Client ( ).start ( );
        while (true) {
            System.out.println ( Bank.getMoney ( ) );
            Thread.sleep ( 1000 );
        }

    }
}


