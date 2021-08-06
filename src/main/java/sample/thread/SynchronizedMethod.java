package sample.thread;

import sample.thread.demo1.Synch;

public class SynchronizedMethod {
    public synchronized void  printNumbers(){
        for(int i = 0; i <=10; i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
