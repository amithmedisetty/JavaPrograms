package InnerClasses;
class OuterClass{
    static int x;
    OuterClass(int x){
        this.x=x;
    }
    class InnerClass{
        int y;
        InnerClass(int y){
            this.y=y;
        }
        void display(){
            System.out.println(y);
            System.out.println(x);
        }
    }
    static class InnerStaticClass{
        static int z;
        InnerStaticClass(int z){
            this.z=z;
        }
        static void display(){
            System.out.println("Static Inner Class: " + z);
        }
    }
}
public class InnerClassExample{
    public static void main(String[] args) {
        OuterClass outer=new OuterClass(1000);
        OuterClass.InnerClass inner=outer.new InnerClass(2000);
        inner.display();
        OuterClass.InnerStaticClass innerstatic=new OuterClass.InnerStaticClass(9000);
        innerstatic.display();
    }
}









//Example -2(Local Classes (Method-Local Inner Classes))
class Outer {
    public void someMethod() {
        final String greeting = "Hello from local class!"; 
        class LocalInner { 
            public void printGreeting() {
                System.out.println(greeting);
            }
        }
        LocalInner local = new LocalInner();
        local.printGreeting();
    }
    public static void main(String[] args) {
        new Outer().someMethod();
    }
}

