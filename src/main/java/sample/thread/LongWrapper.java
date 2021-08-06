package sample.thread;

public class LongWrapper {
    private Object key = new Object();
    private long l ;
    public LongWrapper(long l){
      this.l = l;
    }
    public void incrementLongValue(){
        synchronized (key) {
            l = l + 1;
        }
    }

    public long getL() {
        return l;
    }
}
