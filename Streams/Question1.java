package Streams;
//Given a list of integers, return a list of squares of even numbers only.
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().filter(a -> a % 2 != 0).forEach(System.out::println);
    }
}
