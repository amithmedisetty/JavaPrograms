package Reflections.Manipulating_Objects;
import java.lang.reflect.Method;
class A{
    String name;
    int rollnumber;
    private int marks;
    A(String name,int rollnumber,int marks){
        this.name=name;
        this.rollnumber=rollnumber;
        this.marks=marks;
    }
    public String getInfo(){
        return "Name :"+name+" Rollnumber:"+rollnumber;
    }
    private int getMarks(){
        return marks;
    }
}   

public class InvokingMethods{
    public static void main(String[] args) {
        A a=new A("Amith",46,92);
        Class<?> clazz=a.getClass();
        try{
            Method m=clazz.getMethod("getInfo");
            System.out.println(m.invoke(a));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Method m=clazz.getDeclaredMethod("getMarks");
            m.setAccessible(true);
            System.out.println(m.invoke(a));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}