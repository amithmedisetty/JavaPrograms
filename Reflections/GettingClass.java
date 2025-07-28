package Reflections;
import java.io.*;
class A{
    int a=20;
    public void display() {
        System.out.println("Display method in class A");
    }
}
public class GettingClass {
    public static void main(String[] args) {
        Class<?> clazz=A.class;  //1st way to get class object
        System.out.println("Class Name: " + clazz.getName());
        try{
            Class<?> clazz2=Class.forName("Rflections.A"); //2nd way to get class object
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        A a=new A();
        Class<?> calzz3=a.getClass();//3rd way to get class object(by object)
    }
}
