package com.company;

//Stack also implements List interface
//uses push,pop and peek operations
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack <Integer>st1=new Stack<>();
        st1.push(8);
        st1.push(3);
        st1.push(19);
        st1.push(15);


        System.out.println("Stack st is --> "+ st1);

        Collections.sort(st1);
        System.out.println("Stack st is --> "+ st1);

        System.out.println("Deleted element is -->  "+st1.pop());    //deletes element at top and returns its value
        System.out.println("Stack st after deleting element at top = "+st1);

        System.out.println("Element at top is --> "+ st1.peek());   //peek is used to look for the element at top

        if(st1.isEmpty())
            System.out.println("Stack empty.");
        else
            System.out.println("Stack not empty.");

        Stack<String> st2=new Stack<>();
        st2.add("Black");
        st2.add("Green");
        st2.add("Red");
        st2.add("Yellow");
        st2.add("Orange");
        System.out.println("Stack st2 is = "+st2);

        System.out.println("Iterating st2 -->");
        for (String s:st2) {
            System.out.println(s);
        }

        System.out.println(st2.search("Red"));    //returns position of object if present else returns -1
    }
}
