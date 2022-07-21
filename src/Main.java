public class Main implements Runnable{
    public void run() {
        System.out.println ("A" );
        try {
            Thread.sleep ( 10000 );
        }catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("B" );
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread ( new Main ()) .start ();

        //Thread.currentThread ().join ();
        new Thread ( new Main () ).start ();

    }
}
