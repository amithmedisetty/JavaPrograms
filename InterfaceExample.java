//by default all the variables in an interface are public static final
//by default all the methods in an interface are public abstract
//interfaces can have default and static methods since Java 8
//interfaces can have private methods since Java 9
//we can use default methods to call private methods
//interfaces cannot be instantiated directly, they need to be implemented by a class(so no constructors)
//interfaces can extend multiple interfaces but not classes
//go through daimond problem in interfaces and multiple interfaces
interface Car {
    int MAX_SPEED = 500;
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
    private void privateMethod() {
        System.out.println("This is a private method in the interface.");
    }
    default void callPrivate(){
        privateMethod();
    }
    void steering();
    void accelerate();
    void brake();
}
class Ferari implements Car{
    @Override
    public void steering() {
        System.out.println("Ferari steering");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferari accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ferari braking");
    }
}
class ford implements Car{
    @Override
    public void steering() {
        System.out.println("Ford steering");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Ford braking");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Car car1 = new Ferari();
        car1.steering();
        car1.accelerate();
        car1.brake();
        car1.defaultMethod();
        car1.callPrivate();
        
        Car car2 = new ford();
        car2.steering();
        car2.accelerate();
        car2.brake();
        car2.defaultMethod();
        car2.callPrivate();

        Car.staticMethod(); 
    }
}






interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from B");
    }
}

class C implements A, B {
    @Override
    public void greet() {
        // Your own logic here
        System.out.println("Hello from C (my own logic)");
        //A.super.greet(); //to call A's greet
        //B.super.greet(); // to call B's greet
    }

    public static void main(String[] args) {
        new C().greet();
    }
}
