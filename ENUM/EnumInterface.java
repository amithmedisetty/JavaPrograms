package ENUM;

interface Greeting {
    void greet();
}
enum Language implements Greeting {
    ENGLISH {
        public void greet() {
            System.out.println("Hello");
        }
    },
    SPANISH {
        public void greet() {
            System.out.println("Hola");
        }
    }
}

public class EnumInterface {
    public static void main(String[] args) {
        Language.ENGLISH.greet(); 
    }
}
