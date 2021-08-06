package sample.thread.deadlock.singleinstance;

import sample.thread.deadlock.singleinstance.CommonLock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Notifier implements Runnable {
    Map<Integer,String> map = new ConcurrentHashMap<>();
    CommonLock commonLock;
    public Notifier(CommonLock commonLock){
        this.commonLock = commonLock;
    }
    @Override
    public void run() {
        synchronized (commonLock){
            for(int i = 0; i<10; i++){
                System.out.println(i);
                //commonLock.notify();
            }
        }
    }
}
