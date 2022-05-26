package com.company;
//displays elements in random order using hashing technique
//does not store duplicate elements
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyHashSet{
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        hs.add(15);
        hs.add(6);
        hs.add(9);
        hs.add(12);
        hs.add(1);
        hs.add(19);
        hs.add(2);
        hs.add(17);
        System.out.println("Hash Set is = "+hs);

        System.out.println(("Size of hashSet is = "+hs.size()));
        hs.remove(9);
        System.out.println(hs);

        if(hs.isEmpty()){
            System.out.println("hashSet is Empty");
        }
        else{
            System.out.println(("Hash Set is not empty"));
        }

        System.out.println(hs.contains(5));


    }
}