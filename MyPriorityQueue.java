package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();

        pq.offer(7);
        pq.offer(15);
        pq.offer(2);
        pq.offer(19);
        pq.offer(25);
        pq.offer(9);
        //follows min heap in which first element is smallest
        System.out.println(pq);

        pq.poll();    //removes head of queue
        System.out.println(pq);

        System.out.println(pq.peek());  //displays element at head of queue

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);


    }

}
