package sample.thread.deadlock.dobleinstance;

public class CommonLock2 {
    public static void main(String args[]){
        CommonLock2 commonLock1= new CommonLock2();
        CommonLock2 commonLock2= new CommonLock2();
       /* Waiter2 waiter = new Waiter2(commonLock1,commonLock2);
        Notifier2 notifier = new Notifier2(commonLock1,commonLock2);
        Thread t1 = new Thread(waiter);
        Thread t2 = new Thread(notifier);
        t1.start();
        t2.start();*/

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                synchronized (commonLock1){
                    for (int i = 0; i <=10; i++){
                        System.out.println(i);
                        synchronized (commonLock2){

                        }
                    }
                }

            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                synchronized (commonLock1){
                    for (int i = 0; i <=10; i++){
                        System.out.println(i);
                        synchronized (commonLock2){

                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
