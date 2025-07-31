package Streams;
import java.util.*;
import java.util.stream.Collectors;
public class Question3 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        List<Integer> l=list.stream().flatMap(l1->l1.stream()).collect(Collectors.toList());
    }
}
