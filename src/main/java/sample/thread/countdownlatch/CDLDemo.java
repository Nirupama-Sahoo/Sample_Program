package sample.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CDLDemo {

    public static void main(String args[]){
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet();
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Starting");

        CountDownLatch cdl1 = new CountDownLatch(5);

        new MyThread(cdl);
        new MyThread(cdl1);
        try{
            cdl.await();
            cdl1.await();
        }catch (InterruptedException exception){
            System.out.println(exception);
        }
        System.out.println("Done");
    }
}
