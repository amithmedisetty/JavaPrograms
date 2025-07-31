package CustomAnotations;
@AnimalAnotation
public class Cat {
    String name;
    Cat(String name){
        this.name=name;
    }
    @MethodAnotation(count=3)
    public void meow(){
        System.out.println("making sound as meow");
    }
    public void eat(){
        System.out.println("munch");
    }
}
