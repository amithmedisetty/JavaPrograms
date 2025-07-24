class Variables{
    int a;    //instance variable
    static int b;    //static variable
    public void method1(){
        int c = 10; // Local variable
        System.out.println("Local variable c: " + c);
    }
}
public class VariableTypes{
    public static void main(String[] args) {
        Variables.b=20;
        Variables obj = new Variables();
        System.out.println(obj.b);
        Variables obj1 = new Variables();
        obj1.b=40;
        System.out.println(obj1.b);
        System.out.println(obj.b);
    }
}




// Variables

// to locate where exactly my data resides in the memory
// container that holds the data
// three types
// 1)local variables: declared inside the method/constructor/block and accessed only within them(stored in stack)
// 2)instance variables: declared within the class but outside methods/constructors/block 
// --Belongs to the object and each object gets its own copy
// --methods/constructors/blocks can access them but not static methods/blocks as static ones belong to class rather than any object ,if we want to do it create a object in the static method/blocks and access them
// 3)static variable: declared within the class belongs to the class rather than each object
// --shared by all objects
// --and accessible from all the methods/blocks
// --cannot be declared in any method