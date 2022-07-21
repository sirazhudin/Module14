import java.util.HashSet;
import java.util.Set;

public class Main14_3_2 {

    private Set<String> intSet = new HashSet<> (  );

    private synchronized void addElementToSet() {
        intSet.add ( "Hello" );
    }

    private synchronized void removeElementFromSet() {
        intSet.remove ( "Hello" );
    }

    public static void main(String[] args) throws InterruptedException{
        Main14_3_2 main14_3_2 = new Main14_3_2 ();

        Thread t1 = new Thread (  ) {
            public void run() {
                for (int i=0;i<100;i++) {
                    main14_3_2.addElementToSet ();
                }
            }
        };
        Thread t2 = new Thread (  ) {
            public void run() {
                main14_3_2.removeElementFromSet ();
            }
        };

        t1.start ();t2.start ();
        t1.join ();t2.join ();

        System.out.println ("Set size; " + main14_3_2.intSet.size () );
    }
}
