package Collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.remove(Integer.valueOf(3));
        list.set(1,3);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(2));
        
    }
}
