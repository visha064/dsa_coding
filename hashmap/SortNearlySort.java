package com.company.coding.hashmap;

import java.util.PriorityQueue;

public class SortNearlySort {

    public static void sns(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<arr.length-k;i++){
            if (i<k){
                pq.add(arr[i]);
            }
            else{
                pq.add(arr[i]);
                System.out.print(pq.peek()+",");
                pq.remove();
            }
        }
        while(pq.size()>0){
            System.out.print(pq.peek()+",");
            pq.remove();
        }
    }

    public static void main(String[] args) {
        int [] arr={2,3,1,4,6,7,5,8,9};
        sns(arr,2);
    }
}
