package ObjectCreation;
import java.io.*;

class A implements Serializable{
    int temp=100;
}
public class ByDesrialization {
    public static void main(String[] args) {
        A a =new A();
        try {
            // serialization
            ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("A.ser"));
            obj.writeObject(a);
            obj.close();

            //deserialization
            ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("A.ser"));
            A a1=(A)obj1.readObject();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
