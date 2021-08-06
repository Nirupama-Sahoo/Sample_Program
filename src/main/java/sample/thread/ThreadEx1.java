package sample.thread;

public class ThreadEx1  implements Runnable{

    @Override
    public void run() {
            synchronized (this) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        System.out.println("Error :" + ex.getMessage());
                    }
            }

        }

    }
    public  static void main(String args[]){
        ThreadEx1 threadEx1 = new ThreadEx1();
        Thread thread1 = new Thread(threadEx1);
        Thread thread2 = new Thread(threadEx1);
        thread1.start();
        thread2.start();
    }
}
