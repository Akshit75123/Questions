package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);

        System.out.println(set);

        if (set.contains(1))
            System.out.println("1 is present");
        set.remove(1);
        System.out.println(set);

        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}