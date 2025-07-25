//the methods that are in the child class should respect the exceptions of the parent class
//child class methods which are overriding parent class methods can throw the same or more specific exceptions but not broader one(if parent class is throwing IOException, child class cannot throw Exception)
//child class method show throw the same exception as parent class method, or a more specific exception, but not a broader one, or no exception at all
//if the child class method throws a broader exception than the parent class method, it will result in a compile-time error

package ExceptionalHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
    void method1() throws IOException{
        throw new IOException("Exception from A");
    }   
}
class B extends A{
    void method1() throws FileNotFoundException{
        throw new FileNotFoundException("Exception from B");
    }
}
public class ExceptionInPolymorphism {
    public static void main(String[] args) {
        try{
            A a=new B();
            a.method1();
        }
        catch(FileNotFoundException e){
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
        catch(IOException e){
            System.out.println("Caught IOException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
}
