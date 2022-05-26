package com.company;

import java.util.LinkedList;
import java.util.List;
//same methods as in array list
public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> ll1=new LinkedList<>();
        ll1.add(5);
        ll1.add(9);
        ll1.add(1);
        ll1.add(3);
        ll1.add(19);
        ll1.add(15);
        ll1.add(5);
        System.out.println(ll1);
    }
}
