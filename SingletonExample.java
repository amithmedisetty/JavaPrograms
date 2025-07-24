// Singleton class in Java is a class that allows only one instance of itself to be created and provides a global point of access to that instance.
//make private static variable to hold the single instance of the class
//make the constructor private to prevent instantiation from outside the class 
//provide a public static method that returns the instance of the class, creating it if it does not already exist
//This pattern is often used for managing shared resources, such as database connections or configuration settings.
public class SingletonExample {
    private static SingletonExample instance;
    private SingletonExample() {
        System.out.println("Database connection created.");
    }
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    public void connect(String user) {
        System.out.println(user + " connected to the database.");
    }

    public static void main(String[] args) {
        SingletonExample db1 = SingletonExample.getInstance();
        db1.connect("User1");

        SingletonExample db2 = SingletonExample.getInstance();
        db2.connect("User2");
        System.out.println("Are both users using the same connection? " + (db1 == db2));
    }
}
