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
