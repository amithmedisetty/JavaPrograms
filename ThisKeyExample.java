// To refer current class instance variable
// To invoke current class methods
// To invoke current class constructor
// To Pass the Current Object as an Argument
// To Return the Current Object from a Method
// To Call Another Constructor in the Same Class
// Inside Inner Classes to Refer Outer Class Object
// When Implementing Method Chaining (Fluent API)
public class ThisKeyExample {

    int x;
    public void setX(int x) {
        this.x = x; 
    }
    public void show() {
        System.out.println("x = " + this.x);
        this.display();
    }
    public void display() {
        System.out.println("Display method called");
    }
    public ThisKeyExample() {
        this(10); 
        System.out.println("Default constructor called");
    }

    public ThisKeyExample(int x) {
        this.x = x;
        System.out.println("Parameterized constructor called");
    }
    public void passObject() {
        helper(this);
    }

    public void helper(ThisKeyExample obj) {
        System.out.println("Object passed: x = " + obj.x);
    }
    public ThisKeyExample returnThis() {
        return this;
    }
    class Inner {
        int x=20;
        void printOuter() {
            System.out.println("Outer x from inner: " + ThisKeyExample.this.x);
            System.out.println("Inner x: " + this.x);
        }
    }
    public ThisKeyExample increment() {
        this.x++;
        return this;
    }

    public static void main(String[] args) {
        ThisKeyExample obj = new ThisKeyExample();
        obj.setX(5); 
        obj.show(); 
        obj.passObject(); 
        ThisKeyExample obj2 = obj.returnThis(); 
        System.out.println("Returned object is same: " + (obj == obj2));
        Inner inner = obj.new Inner();
        inner.printOuter(); 
        obj.increment().increment().show(); 
    }
}