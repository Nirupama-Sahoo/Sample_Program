package sample.thread;

public class ThreadExWithAnnonymousClass {

    public static void main(String args[]){
        ThreadExWithAnnonymousClass threadExWithAnnonymousClass = new ThreadExWithAnnonymousClass();
        Runnable t1 = new Runnable(){

            @Override
            public void run() {
                synchronized (threadExWithAnnonymousClass){
                    for(int i = 0; i <=10; i++){
                        System.out.println(i);
                        try{
                            Thread.sleep(1000);
                        }catch (InterruptedException ex){
                            System.out.println("Error  :"+ ex.getMessage());
                        }
                    }
                }
            }

        };
        Runnable t2 = new Runnable(){

            @Override
            public void run() {
                synchronized (threadExWithAnnonymousClass){
                    for(int i = 0; i <=10; i++){
                        System.out.println(i);
                        try{
                            Thread.sleep(1000);
                        }catch (InterruptedException ex){
                            System.out.println("Error  :"+ ex.getMessage());
                        }
                    }
                }
            }

        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}
