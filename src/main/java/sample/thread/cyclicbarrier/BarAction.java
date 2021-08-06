package sample.thread.cyclicbarrier;

public class BarAction implements  Runnable{
    @Override
    public void run() {
        System.out.println("Barrier Reached!!!");
    }
}
