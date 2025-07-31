package Threads;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class LocksExample{ 
    private static ReentrantLock lock=new ReentrantLock();
    private static Condition condition=lock.newCondition();
    public static void main(String[] args) {
        Runnable r1=()->{
            lock.lock();
            int a=20;
            System.out.println(a*a);
            try {
                System.out.println("r1 is waiting");
                condition.await();
                System.out.println("r1 :recieved signal");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                lock.unlock();
            }
            System.out.println("r1:Condition satisfied by other");
        };

        Runnable r2=()->{
            lock.lock();
            int b=10;
            System.out.println(b*b);
            try{
                System.out.println("r2:signal sending");
                condition.signal();         //we can use condition.signalAll() to resume all the threads ont this condition
            }finally{
                lock.unlock();
            }
            System.out.println("r2: permission given");
        };
        ExecutorService es=Executors.newFixedThreadPool(2);
        es.submit(r1);
        es.submit(r2);
        es.shutdown();
    }
}
