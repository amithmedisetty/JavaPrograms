package Collections.Generics;
import java.util.*;
public class Wildcards {
    void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "Generics", "with", "Wildcards");
        List<Integer> integerList =Arrays.asList(1, 2, 3, 4, 5);

        Wildcards wildcards = new Wildcards();
        System.out.println("String List:");
        wildcards.printList(stringList);

        System.out.println("Integer List:");
        wildcards.printList(integerList);
    }
}
