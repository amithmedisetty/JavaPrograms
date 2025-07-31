package Threads;
import java.util.concurrent.*;
import java.lang.Thread;
class Resource{
    BlockingQueue<Integer> bq=new LinkedBlockingQueue<>(5);
}

public class BlockingQueueExample {
    public static void main(String[] args) {
        Resource r=new Resource();
        Runnable producer=()->{
            int count=0;
            while(true){
                try {
                    System.out.println("Producer produced item: "+count);
                    r.bq.put(count);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                count++;
            }
        };
        Runnable consumer=()->{
            while(true){
                try {
                    Integer val=r.bq.take();
                    System.out.println("consumer consumed: "+val);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();
    }
}
