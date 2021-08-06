package sample.thread.demo1;

import sample.thread.LongWrapper;

import java.util.ArrayList;
import java.util.List;

public class LongWrapperMain {
    public static void main(String args[]) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0);
        Runnable runnable = () -> {
            for(int i = 0; i < 1000; i++){
              longWrapper.incrementLongValue();
          }
        };

        /*Thread[] threads = new Thread[1000];

        for(int i = 0; i <threads.length; i++){
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        for(int i = 0; i <threads.length; i++){
            threads[i].join();
        }*/
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i<1000; i++){
            threads.add(new Thread(runnable));
            threads.get(i).start();
        }
        for(int i = 0; i<1000; i++){
            threads.get(i).join();
        }

        System.out.println(longWrapper.getL());

    }
}
