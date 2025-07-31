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
public class ThreadCreation {
    public static void main(String[] args) {
        Resourse resourse = new Resourse();
        for(int i=0;i<9;i++){
            MyTread m=new MyTread(resourse);
            m.start();
        }
    }
}
