package sample.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements  Runnable{
    CountDownLatch latch;

    MyThread(CountDownLatch c){
        latch = c;
        new Thread(this).start();
    }
    @Override
    public void run() {
        for(int i = 1; i <=50; i++){
            if(i%2 == 0){
                System.out.println(i);
            }

            latch.countDown();
        }
    }
}
