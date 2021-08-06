package sample.thread.deadlock;

public class A {
    Object object1 = new Object();
    Object object2 = new Object();

    public void a(){
        synchronized (object1) {
            System.out.println("[" + Thread.currentThread().getName() + "]" + "I am running in method a()");
            b();
        }
    }
    public void b(){
        synchronized (object2){
            System.out.println("[" + Thread.currentThread().getName() + "]" + "I am running in method b()");
            c();
        }
    }
    public void c(){
        synchronized (object1){
            System.out.println("[" + Thread.currentThread().getName() + "]" + "I am running in method c()");
        }
    }

}
