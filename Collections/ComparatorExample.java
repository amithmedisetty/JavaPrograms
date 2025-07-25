package Collections;
import java.util.*;
public class ComparatorExample {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3,100);
        map.put(4,50);
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        Comparator<Integer> com=new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        };
        Collections.sort(list,com);
    }
}