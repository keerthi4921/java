 class kill implements Runnable
 {
       public void run(){
        while (true){
            System.out.println("Sneha Priya");
        }
       }
 }
 public class Daemon  {
    public static void main(String[] args) {
        kill k=new kill();
        Thread T=new Thread(k);
        T.setDaemon(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        T.start();
        System.out.println(T.isAlive());
        System.out.println(T.isDaemon());
        
    }
}
