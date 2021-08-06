package sample.thread.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableEx implements Callable {

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer randomInt = random.nextInt(10);
        Thread.sleep(randomInt*1000);
        return randomInt;
    }
}
