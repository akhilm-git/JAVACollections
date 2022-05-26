package com.company;
//it uses BST and displays data in ascending order
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(59);
        ts1.add(49);
        ts1.add(79);
        ts1.add(39);
        ts1.add(29);
        ts1.add(9);

        System.out.println("My TreeSet is = "+ts1);

        System.out.println("Size of TreeSet is = "+ts1.size());

        ts1.pollFirst();       //removes first element
        System.out.println("My TreeSet after removing first element = "+ts1);

        ts1.pollLast();      //removes last element
        System.out.println("My TreeSet after removing both first and last element ="+ts1);

        System.out.println(ts1.first());
        System.out.println(ts1.last());

    }
}
