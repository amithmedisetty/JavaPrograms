//Serialization is the process of converting an object's state into a byte stream. 
//This byte stream can then be saved to a file, stored in a database,or transmitted across a network.
// The primary purpose of serialization is to save the state of an object so that it can be recreated later.
//The class whose objects you want to serialize must implement the java.io.Serializable marker interface. This interface has no methods; it just acts as a tag to indicate that the class is eligible for serialization.

package Files;

import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    private String name;
    private int age;
    private int id;
    private transient String password; // transient field will not be serialized
    Student(String name,int age,int id,String password){
        this.name=name;
        this.age=age;
        this.id=id;
        this.password=password;
    }
    @Override
    public String toString(){
        return "name: "+name+" age: "+age+" id: "+id+" password: "+password;
    }
}
public class SerializationExample {
    public static void main(String[] args){
        Student student=new Student("amith",21,101,"Amith@987654321");
        try(ObjectOutputStream obj=new ObjectOutputStream(new java.io.FileOutputStream("student.ser"))) {
            obj.writeObject(student);
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }
}
