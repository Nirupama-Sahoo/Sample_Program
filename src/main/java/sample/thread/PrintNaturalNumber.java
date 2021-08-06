package sample.thread;

public class PrintNaturalNumber implements Runnable{
   static Object lock = new Object();
   static int number = 1;
   int remainder;

   PrintNaturalNumber(int remainder){
       this.remainder = remainder;
   }

    @Override
    public void run() {
    synchronized (lock){
       while(true){
           while (number%3 != remainder){
               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   System.out.println(e.getMessage());
               }

           }
           System.out.println(number);
           number++;
           lock.notifyAll();
       }

    }
    }
    public static void main(String args[]){
        PrintNaturalNumber runnable1 = new PrintNaturalNumber(1);
        PrintNaturalNumber runnable2 = new PrintNaturalNumber(2);
        PrintNaturalNumber runnable3 = new PrintNaturalNumber(3);
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        Thread t3 = new Thread(runnable3);
        t1.start();
        t2.start();
        t3.start();
    }
}
