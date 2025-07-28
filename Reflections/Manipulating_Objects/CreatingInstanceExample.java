package Reflections.Manipulating_Objects;

import java.lang.reflect.Constructor;

class A{
    int a=10;
    int b=20;
    void method1(){
        System.out.println("In method1 of class A");
    }
}

public class CreatingInstanceExample {
    public static void main(String[] args) {
        Class<?> clazz=A.class;   //or Class.forName("Reflections.Manipulating_Objects.A")
        try{
            Constructor<?> constructor=clazz.getConstructor();
            Object obj=constructor.newInstance();
            System.out.println(obj.getClass().getName());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
