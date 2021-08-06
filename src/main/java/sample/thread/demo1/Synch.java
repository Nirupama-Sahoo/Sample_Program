package sample.thread.demo1;

public class Synch {
    public static void main(String args[]){
        Callme target = new Callme();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"World");
        System.out.println("Before join :"+ob3.t.isAlive());
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After join :"+ob3.t.isAlive());
    }

}
