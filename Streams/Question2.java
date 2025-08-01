package Streams;
import java.util.*;
class Person{
    private String name;
    private int age;
    private int height;
    Person(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Person p=new Person("Amith",50,6);
        Person p1=new Person("sujith",40,7);
        List<Person> l=new ArrayList<>();
        l.add(p);
        l.add(p1);
        long count=l.stream().filter(ref->ref.getAge()>20).count();
        System.out.println("Age greater than 20 are of :"+count+" persons");
        Optional<Person> youngest=l.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(youngest.get().getName());
    }
}
