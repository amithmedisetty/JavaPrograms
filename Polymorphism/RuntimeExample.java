package Polymorphism;
class Animal {
    int a=10;
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    int a=20;
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
public class RuntimeExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Calls Dog's sound method due to dynamic binding
        System.out.println("Value of a in Animal: " + animal.a); 
        System.out.println("Value of a in Dog: " + ((Dog) animal).a); // Accessing field from Dog class after downcasting

    }
}
