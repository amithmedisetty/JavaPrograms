package ExceptionalHandling;
class CheckAgeException extends Exception {
    public CheckAgeException(String message) {
        super(message);
    }
}
public class TrowExample {
    public static void main(String[] args) {
        int age=18;
        try{
            if(age<21){
                throw new CheckAgeException("Age must be at least 21");
                // throw new Exception("Age must be at least 21");
            }
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
}
