package ENUM;
enum Animal{
    DOG {
        public void sound(){
            System.out.println("Bark");
        }
    },
    CAT {
        public void sound(){
            System.out.println("Meow");
        }
    };
    public abstract void sound();
}

public class EnumAbstract {
    public static void main(String[] args) {
        Animal animal=Animal.DOG;
        animal.sound(); 
        Animal.DOG.sound();
    }
}
