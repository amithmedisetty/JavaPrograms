package ObjectCreation;
import java.lang.*;
import java.lang.reflect.Constructor;
class A{
    int a;
    void method1(){
        System.out.println("I'm the method in class A");
    }
}

//for prototype design pattern object creation
class B implements Cloneable{
    int speed;
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

//for factory design pattern object creation
interface Car{
    void brandName();
}
class Porsche implements Car{
    public void brandName(){
        System.out.println("Brand Name: Porsche");
    }
}
class Mahindra implements Car{
    public void brandName(){
        System.out.println("Brand Name: Mahindra");
    }
}
class Factory{
    Car getObject(String s){
        switch (s){
            case "porsche":
                return new Porsche();
            
            case "mahindra":
                return new Mahindra();
            default:
                return null;
        }
    }
}
public class CreatingObjectExample {
    public static void main(String[] args) {
        //1st way(by using new keyword)
        A a=new A();

        //2nd way(by reflections)
        A obj;
        try {
            Constructor<A> con=A.class.getConstructor();
            obj=con.newInstance();
            obj.method1();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //3rd way(Prototype design pattern)
        B b1=new B();
        b1.speed=100;
        B b2;
        try{
            b2=(B)b1.clone();
        }catch(CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

        //4th way(Factory design pattern)
        Factory factory=new Factory();
        Car p=factory.getObject("porsche");


    }
}
