public class UsingRunnableInterface  implements Runnable{
    public void run() {
        System.out.println("Runnable interface is running ..");
    }

    public static void main(String[] args) {
        Thread r = new Thread(new UsingRunnableInterface());
        //UsingRunnableInterface r = new UsingRunnableInterface();  : not working
        
        r.start();
    }
    
}
