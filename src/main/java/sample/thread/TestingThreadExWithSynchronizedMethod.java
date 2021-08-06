package sample.thread;

public class TestingThreadExWithSynchronizedMethod {
    public  static void main(String args[]){
        TestingThreadExWithSynchronizedMethod thread = new TestingThreadExWithSynchronizedMethod();
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
            synchronizedMethod.printNumbers();
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                synchronizedMethod.printNumbers();
            }
        };
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
