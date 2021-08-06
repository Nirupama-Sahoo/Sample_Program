package sample.thread.deadlock.dobleinstance;

import sample.thread.deadlock.singleinstance.CommonLock;

public class Waiter2 implements  Runnable {
    CommonLock2 commonLock1,commonLock2;
    public Waiter2(CommonLock2 commonLock1,CommonLock2 commonLock2){
        this.commonLock1 = commonLock1;
        this.commonLock2 = commonLock2;
    }
    @Override
    public void run() {
        synchronized (commonLock1){
            for (int i = 0; i <=10; i++ ){
                System.out.println(i);
               synchronized (commonLock2){

               }

            }
        }
    }
}
