package Reflections.Manipulating_Objects;

import java.lang.reflect.Field;

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

public class Fields {
    public static void main(String[] args) {
        A a=new A("Sujith",42,93);
        Class<?> clazz=a.getClass();
        try{
            // public fields
            Field f=clazz.getDeclaredField("name");
            System.out.println("original name: "+f.get(a));
            f.set(a,"Medisetty Sujith");
            System.out.println("modified name: "+f.get(a));


            //for private fields
            Field f1=clazz.getDeclaredField("marks");
            f1.setAccessible(true);
            System.out.println("original marks"+f1.get(a));
            f1.set(a,95);
            System.out.println("modified marks: "+f1.get(a));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
