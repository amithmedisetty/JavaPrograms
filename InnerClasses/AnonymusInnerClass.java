package InnerClasses;
abstract class Cars {
    public abstract void steering() ;
    public abstract void type();
    public abstract boolean gear() ;
}
public class AnonymusInnerClass {
    public static void main(String[] args) {
        Cars myCar = new Cars(){
            public void steering() {
                System.out.println("Autonomous Steering");
            }
            @Override
            public void type() {
                System.out.println("Electric");
            }
            @Override
            public boolean gear() {
                return false; 
            }
        };
        myCar.steering();
        myCar.type();
        System.out.println(myCar.gear());
    }
}