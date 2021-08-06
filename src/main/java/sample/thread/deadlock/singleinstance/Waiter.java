package sample.thread.deadlock.singleinstance;

public class Waiter implements  Runnable {
    CommonLock commonLock;
    public Waiter(CommonLock commonLock){
        this.commonLock = commonLock;
    }

    @Override
    public void run() {
        synchronized (commonLock){
            for (int i = 0; i <=10; i++ ){
                System.out.println(i);
               /* try {
                    commonLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

            }
        }
    }
}
