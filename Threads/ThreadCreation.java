package Threads;
class Resourse{
    volatile int count=0;
    public synchronized int increment() {
        count++;
        return count;
    }
}
class MyTread extends Thread {
    Resourse resourse;
    MyTread(Resourse resourse) {
        this.resourse = resourse;
    }
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread1 is using the resource: "+resourse.increment());
        }
    }
}
class MyThread2 extends Thread {
    Resourse resourse;
    MyThread2(Resourse resourse) {
        this.resourse = resourse;
    }
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
            System.out.println("Thread2 is using the resource: "+resourse.increment());
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        Resourse resourse = new Resourse();
        MyTread thread1=new MyTread(resourse);
        MyThread2 thread2=new MyThread2(resourse);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        // try {
        //     thread1.join();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        thread2.start();

    }
}
