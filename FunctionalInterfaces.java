interface Animal{
    void sound();
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        Animal dog=()->{
            System.out.println("Dog barks");
        };
        Animal cat=()->{
            System.out.println("meow");
        };
        dog.sound();
        cat.sound();
    }
}
