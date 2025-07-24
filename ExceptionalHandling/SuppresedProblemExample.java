package ExceptionalHandling;
class MyResource implements AutoCloseable {
    public void useResource() {
        System.out.println("Using resource.");
        throw new RuntimeException("Error while using resource");
    }
    @Override
    public void close() {
        System.out.println("Resource closed.");
        throw new RuntimeException("Error while closing resource");
    }
}
public class SuppresedProblemExample{
    public static void main(String[] args) {
        try(MyResource resource=new MyResource()) {
            resource.useResource();
        }
        catch(RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            if (suppressed.length > 0) {
                System.out.println("Suppressed exceptions:");
                for (Throwable t : suppressed) {
                    System.out.println(t.getMessage());
                }
            } else {
                System.out.println("No suppressed exceptions.");
            }
        }
    }
}
