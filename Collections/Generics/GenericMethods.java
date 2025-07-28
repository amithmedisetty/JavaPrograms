package Collections.Generics;

public class GenericMethods {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        String[] stringArray = {"Hello", "Generics", "in", "Java"};
        Integer[] integerArray = {1, 2, 3, 4, 5};

        System.out.println("String Array:");
        printArray(stringArray);

        System.out.println("Integer Array:");
        printArray(integerArray);
    }    
}