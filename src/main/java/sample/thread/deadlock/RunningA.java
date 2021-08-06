package sample.thread.deadlock;

public class RunningA {
    public static void main(String args[]) throws InterruptedException {
        A a = new A();

        Runnable runnable1 = () -> a.a();
        Runnable runnable2 = () -> a.b();

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
