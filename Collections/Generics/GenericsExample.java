package Collections;
class Box<T>{
    private T item;
    public Box(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
public class GenericsExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Generics");
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("String Box contains: " + stringBox.getItem());
        System.out.println("Integer Box contains: " + integerBox.getItem());
    }
}
