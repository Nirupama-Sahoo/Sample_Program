package sample.thread.deadlock.singleinstance;

public class CommonLock {
    public static void main(String args[]){
        CommonLock commonLock = new CommonLock();
        Waiter waiter = new Waiter(commonLock);
        Notifier notifier = new Notifier(commonLock);
        Thread t1 = new Thread(waiter);
        Thread t2 = new Thread(notifier);
        t1.start();
        t2.start();
    }
}
