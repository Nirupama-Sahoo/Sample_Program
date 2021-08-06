package sample.thread;

public class ProducerConsumer {

    private static Object key = new Object();

    private static int[] buffer;
    private static int count;

    static class Producer {
        void produce() {
            synchronized (key){
                if (isFull(buffer)) {
                    try {
                        key.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                key.notifyAll();
            }

        }
    }
    static class Consumer{
            void consume(){
                synchronized (key){
                    if (isEmpty(buffer)){
                        try {
                            key.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    buffer[--count] = 0;
                    key.notifyAll();
                }
            }
    }


    static boolean isEmpty(int[] buffer){
        return count==0;
    }
    static boolean isFull(int[] buffer){
        return count==buffer.length;
    }
    public static void main(String args[]) throws InterruptedException {

        buffer = new int[10];
        count = 0;

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable runnable1 = () -> {
            for(int i = 0; i<50; i++){
                producer.produce();
            }
            System.out.println("Done Producing");

        };
        Runnable runnable2 = () -> {
            for(int i = 0; i<45; i++){
                consumer.consume();
            }
            System.out.println("Done Consuming");

        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Data in Buffer :"+count);

    }
}
