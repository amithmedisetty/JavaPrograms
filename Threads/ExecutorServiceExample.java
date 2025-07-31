package Threads;
import java.util.concurrent.*;
public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception{
        ExecutorService es=Executors.newFixedThreadPool(1); //1 thread is created in os and handles the three tasks1(Callable/Runnable)
        Callable<String> task1=()->{
            Thread.sleep(1000);
            return "Result from c1";
        };
        Callable<String> task2=()->{
            Thread.sleep(1000);
            return "Result from c2";
        };
        Callable<String> task3=()->{
            Thread.sleep(1000);
            return "Result from c3";
        };
        Future<String> f1=es.submit(task1);
        Future<String> f2=es.submit(task2);
        Future<String> f3=es.submit(task3);
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
    }
}