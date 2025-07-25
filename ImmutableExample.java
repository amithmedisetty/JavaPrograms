//An Immutable class is a class whose instances cannot be modified after they are created. Once an object of an immutable class is instantiated, its state remains constant throughout its lifetime. Any "modification" to an immutable object results in the creation of a new object with the modified state.
//Make class as final to prevent subclassing
//Make all fields private and final to ensure they cannot be changed after object creation
//Provide a constructor to initialize all fields
//Do not provide setter methods to prevent modification of fields  
import java.util.*;
public class ImmutableExample {
    private final String name;
    private final int age;
    private final List<String> hobbies;
    public ImmutableExample(String name, int age,ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); // deep copy to ensure immutability
    }
    ArrayList<Integer> a=new ArrayList<>();
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies); // return a copy to maintain immutability
    }
    @Override
    public String toString() {
        return "name: "+name + ", age: " + age + ", hobbies: " + hobbies;
    }

    public static void main(String[] args) {
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Traveling");
        ImmutableExample person = new ImmutableExample("Alice", 30,hobbies);
        System.out.println(person);
        hobbies.add("Cooking"); // This will not affect the original hobbies list in person
        System.out.println("After modifying hobbies list: " + person.getHobbies());
        // person.age = 31; // This line would cause a compilation error since there are no setters
    }
}
