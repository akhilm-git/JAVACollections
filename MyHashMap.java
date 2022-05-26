package com.company;
//hashmap can have same values but only unique keys
//maintains no order

//similar for treemap except that treemap displays in ascending order
import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hm1 = new HashMap<>();
//        hm1.put(1, "Amit");
//        hm1.put(2, "Sakshi");
//        hm1.put(3, "Rahul");
//        hm1.put(4, "Bhavya");
//        hm1.put(5,"Anuj");
//        hm1.put(6,"l");
        hm1.put("One",1);
        hm1.put("Two",2);
        hm1.put("Three",3);
        hm1.put("Four",4);
        hm1.put("Five",5);
        System.out.println(hm1);

        hm1.put("Three", 5);     //overrides value
        System.out.println(hm1);

        hm1.putIfAbsent("Four", 7);  //override only if value is absent
        System.out.println(hm1);

        hm1.putIfAbsent("Five", 9);
        System.out.println(hm1);

        hm1.remove(1);       //removes a key with its value
        System.out.println(hm1);

        System.out.println("Printing only keys = "+hm1.keySet());
        System.out.println("Printing only Values = "+hm1.values());

        System.out.println("Printing with key and values. ");
        for(Map.Entry<String,Integer> e:hm1.entrySet() )
        System.out.println(e);

        System.out.println("iterating only keys ");
        for(String key:hm1.keySet()){
            System.out.println(key);
        }

        System.out.println("Iterating only values ");
        for(Integer value:hm1.values()){
            System.out.println(value);
        }

    }

}