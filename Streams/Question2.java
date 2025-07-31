package Streams;
// Find the longest string from a list using streams.
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        String[] a={"apple", "banana", "pear", "watermelon"};
        Optional<String> lon=Arrays.asList(a).stream().max(Comparator.comparing(String::length));
        lon.ifPresent(System.out::println);
    }
}
