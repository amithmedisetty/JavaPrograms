package Streams;
//Given a list of integers, return a list of squares of even numbers only.

//use method signatures if possible
//Methods in streams which are used the most
//-->returns the stream---->>>map, filter, distinct, flatmap, sorted, limit, skip  
//-->ends the stream--->>> count, collect, reduce, foreach, min, max, 
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 8,2, 3, 4, 5, 6, 7);
        list.stream().distinct().sorted().filter(a -> a % 2 != 0).forEach(System.out::println);


        List<String> list1=Arrays.asList("x","y","z","k","l","m");
        list1.stream().limit(2).skip(2).forEach(System.out::println);


        List<String> list2=Arrays.asList("Apple","Mangoo","kiwi","guvva");
        long l=list2.stream().filter(s->s.equals(s.toLowerCase())).count();
        System.out.println(l);


        int min=list.stream().min(Comparator.naturalOrder()).orElseThrow();
    }
}
