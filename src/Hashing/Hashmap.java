package Hashing;

import java.util.*;

public class Hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("Germany",3);
        map.put("Pakistan",67);

        System.out.println(map);

        if (map.containsKey("India"))
            System.out.println("Yey!!");

        System.out.println(map.get("Pakistan"));
        System.out.println(map.get("China"));


        map.put("Pakistan",87);




    }
}