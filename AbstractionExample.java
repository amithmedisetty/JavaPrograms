//static, final, private methods cannot be declared in an abstract class
//we can have static and instance variables in an abstract class
//connot have constructors in an interface and abstraction as we cannot create object
// Default methods must have a body, whereas abstract means no body. so we cannot have default in abstract method
abstract class Cars{
    private final String brand;
    public Cars(String brand){
        this.brand=brand;
    }
    public abstract void steering();
    public abstract void type();
    public abstract boolean gear();
}
class Porsche extends Cars{
    Porsche(){
        super("Porsche");
    }
    public void steering(){
        System.out.println("Hydrolic");
    }
    public void type(){
        System.out.println("ai integrated");
    }
    public boolean gear(){
        return false;
    }
}
class Mahindra extends Cars{
    Mahindra(){
        super("Mahindra");
    }
    public void steering(){
        System.out.println("Hydrolic");
    }
    public void type(){
        System.out.println("Manual");
    }
    public boolean gear(){
        return true;
    }
}
public class AbstractionExample{
    public static void main(String[] args) {
        Cars obj=new Porsche();
        obj.steering();
        obj.type();
        System.out.println(obj.gear());
    }
}