package ExceptionalHandling;

public class ThrowsExample {
    static void checkAge(int age) throws Exception {
        if (age < 21) {
            throw new Exception("Age must be at least 21");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
    public static void main(String[] args) throws Exception {
        int age = 18;
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
        
    }
}
