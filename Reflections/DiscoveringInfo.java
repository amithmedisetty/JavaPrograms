
//In this file, We are using Java Reflection to dynamically discover and display information about class A, 
//such as its fields, methods, constructors, and implemented interfaces.
package Reflections;
import java.lang.reflect.*;

interface Interface1 {
    void method1();
}
interface Interface2 {
    void method2();
}
class A implements Interface1, Interface2{
    int a=20;
    int b=10;
    int c=30;
    A(){
        System.out.println("Constructor of class A");
    }
    A(int a){
        System.out.println("Constructor of class A of parameter int type and value is: "+a);
    }
    public void method1(){
        System.out.println("Method1 in class A");
    }
    public void method2(){
        System.out.println("Method2 in class A");
    }
    public void method3(int n){
        System.out.println("Method3 in class A and integer is: "+n);
    }
}
public class DiscoveringInfo {
    public static void main(String[] args) {
        Class<?> clazz=A.class;
        //getting classes name
        System.out.println("Class Name: " + clazz.getName());

        //getting package name
        System.out.println("Package Name"+clazz.getPackageName());

        //getting the interfaces implemented by class A
        Class<?>[] interfaces=clazz.getInterfaces();
        for(Class<?> iface:interfaces){
            System.out.println("Interface: " + iface.getName());
        }

        //getting fileds in A class
        Field[] fields=clazz.getDeclaredFields();
        System.out.println("Fields in class A:");
        for(Field f:fields){
            System.out.println(f.getName()) ;
        }

        //getting a particular field in A class
        try{
            Field f=clazz.getField("c");
            A obj=new A();
            System.out.println("Actual value: "+f.get(obj));
            f.set(obj,100);
            System.out.println("edited one: "+f.get(obj));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



        //getting the methods in A class(including the implemented methods not only declared in class A)
        Method[] methods=clazz.getMethods();
        System.out.println("Methods in class A:");
        for(Method method: methods){
            System.out.println(method.getName());
        }

        //getting the methods in A class(which are decalred in A only, not the implementation of methods of another class)
        Method[] m=clazz.getDeclaredMethods();
        System.out.println("Declared methods in class A");
        for(Method i:m){
            System.out.println(i.getName());
        }


        //getting a particular method from class A
        try{
            Method m1=clazz.getMethod("method3", int.class);
            A a=new A();
            m1.invoke(a,10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        //getting the constructors
        Constructor<?>[] con=clazz.getConstructors();
        for(Constructor<?> c:con){
            System.out.println(c);
        }

        //getting a particular constructor
        try {
            Constructor<?> con1=clazz.getConstructor(int.class);
            System.out.println(con1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
    }
}
