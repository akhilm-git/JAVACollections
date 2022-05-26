package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Dynamic size array
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(5);
        al1.add(10);
        al1.add(15);
        al1.add(20);
        al1.add(25);
        al1.add(30);

        System.out.println("Array list al1 is --> " +al1);
        System.out.println("Array list al1 size --> " +al1.size());

        al1.set(2, 79);
        System.out.println("New al1 after changing element at index 2 is --> "+ al1);
        System.out.println("Element at 4th position --> "+al1.get(4));

        Collections.sort(al1);      //sorting list
        System.out.println("Array List in ascending order --> ");
        System.out.println(al1);

        System.out.println("Array List in descending order --> ");
        Collections.sort(al1,Collections.reverseOrder());
        System.out.println(al1);

        //creating list al2 using constructor
        List<Integer> al2=new ArrayList<>(List.of(11,22,33,44,55,66));
        System.out.println("Array list al2 --> " +al2);

        al2.remove(2);
        System.out.println("Array list al2 after removing element at index 2 --> " +al2);

        al2.clear();
        System.out.println("Array list al2 after clearing --> " +al2);

        if(al2.isEmpty())         //returns boolean value
            System.out.println("Array List al2 is Empty");
        else
            System.out.println("Array List al2 is not Empty");

        List<Integer> al3=new ArrayList<>();
        al3.add(100);
        al3.add(200);
        al3.add(300);

        al3.addAll(al3);         //copies a1 to a3
        System.out.println("ArrayList al3 --> "+al3);

        System.out.println("----Iterating----");
        //iterating
        for (Integer i1:al3) {
            System.out.println("Foreach --> "+i1);
        }
    }
}
