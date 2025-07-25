//the exceptions that thrown by the lamda function should be same the exceptions declared in the functional interface
 //if the functional interface method throws a broader exception than the lambda function, it will result in a compile-time error
 //we can throw exceptions in the lambda function that are declared in the functional interface, or a more specific exception, but not a broader one, or no exception at all
package ExceptionalHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
interface A{
    void execute() throws IOException;
}
public class ExceptionInFunctionalInterface {
    public static void main(String[] args) {
        A a = () -> {
            throw new FileNotFoundException("Exception in functional interface");
        };

        try {
            a.execute();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
