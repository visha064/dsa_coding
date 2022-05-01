package com.company.coding.hashmap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement {

    public static void klarge(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for (int i=k;i<arr.length;i++){
            if (arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        for (int i :pq){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,10,5,17,7,18,6,4};
        klarge(arr,3);
    }
}
