package Files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class DeSerialization{
    public static void main(String[] args) {
        Student s2 = null;

        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            s2 = (Student) in.readObject(); 
            System.out.println("Student object deserialized from student.ser");
            System.out.println(s2);

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
    }
}