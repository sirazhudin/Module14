import java.util.ArrayList;
import java.util.List;

public class Main14_3_3 {
    private List<String> stringList = new ArrayList<> (  );

    private void addElemToList() {
        synchronized (this) {
            stringList.add ( "Hello" );
        }
    }
    private synchronized void addAnotherElemToList() {
        stringList.add ( "HelloAgain" );
    }

    public static void main(String[] args) throws InterruptedException{
        Main14_3_3 main14_3_3 = new Main14_3_3 ();

        Thread t1 = new Thread (  ) {
            public void run() {
                for(int i = 0; i < 100; i++ ){
                    main14_3_3.addElemToList ();
                    main14_3_3.addAnotherElemToList ();
                    System.out.println ("Thread t1 " );
                }
            }
        };

        Thread t2 = new Thread (  ) {
            public void run() {
                for(int i = 0; i < 100; i++ ){
                    main14_3_3.addElemToList ();
                    main14_3_3.addAnotherElemToList ();
                    System.out.println ("Thread t2 " );
                }
            }
        };
        t1.start ();t2.start ();
        t1.join ();t2.join ();

        System.out.println ("List size: "+main14_3_3.stringList.size () );
    }
}
