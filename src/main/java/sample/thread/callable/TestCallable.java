package sample.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        FutureTask[] randomFutureTask = new FutureTask[10];
        for(int i =0; i < 10 ; i++){
            Callable callable = new CallableEx();
            randomFutureTask[i] = new FutureTask(callable);

            Thread thread = new Thread(randomFutureTask[i]);
            thread.start();
        }

        for(int i =0; i<10; i++){
            Object obj = randomFutureTask[i].get();
            System.out.println(obj);
        }

    }
}
