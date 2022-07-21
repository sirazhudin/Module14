class Processor extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {int count = 0;
        while (running) {
            count++;
            System.out.println ("Processing " +count);

            try {
                Thread.sleep ( 1000 );
            }catch (InterruptedException e){
                e.printStackTrace ();
            }
        }
   }
    public void shutDown() {
        running=false;
    }
}
class App{
    public static void main(String[] args) throws InterruptedException{
        Processor processor = new Processor ();
        processor.start ();
        Thread.sleep ( 10000 );
        processor.shutDown ();
    }
}
