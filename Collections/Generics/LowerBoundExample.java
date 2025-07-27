package Collections.Generics;
import java.util.*;

public class LowerBoundExample {
    public static void printNumbers(List<? super Integer> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        List<Number> intList = Arrays.asList(1, 2, 3);
        printNumbers(intList);  
    }
}