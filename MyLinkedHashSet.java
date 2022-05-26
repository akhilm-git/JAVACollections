package com.company;
//displays elements in an order in which they are inserted
//does not store duplicate elements
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> lhs=new LinkedHashSet<>();
        lhs.add(15);
        lhs.add(5);
        lhs.add(20);
        lhs.add(25);
        lhs.add(10);

        System.out.println("My LinkedHashSet is = "+lhs);
        lhs.clear();
        System.out.println("LinkedHashSet after clearing is = "+lhs);

        Set<Integer> lhs1=new LinkedHashSet<>();
        lhs1.add(19);
        lhs1.addAll(lhs);    //does not work
        System.out.println("My second LinkedHashSet is = " +lhs1);
    }

}
