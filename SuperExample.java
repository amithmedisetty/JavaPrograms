class Animal {
    int a=1000;
    Animal(){
        System.out.println("In animal constructor");
    }
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    int a=100;
    Dog(){
        System.out.println("In dog constructor");
    }
    void eat() {
        System.out.println("Dog is eating");
    }
    void display() {
        System.out.println(super.a);// Accessing Animal's instance variable
        super.eat(); // Calls Animal's eat()
    }
}
public class SuperExample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display(); 
        Animal animal = new Dog();
        animal.eat(); 
    }
}