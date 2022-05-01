package com.company.coding.hashmap;

import java.util.HashMap;

public class LongestconsequtiveSequence {
    public static void lcs(int[] arr){
        HashMap<Integer,Boolean> hm=new HashMap<>();
        //all true
        for (int i =0;i<arr.length;i++){
            hm.put(arr[i],true);
        }
        //find start
        for (int c :arr){
            if (hm.containsKey(c-1)){
                hm.put(c,false);
            }
        }
        //final ans
        int ans=arr[0];
        int size=0;
        for (int c :hm.keySet()){
            if (hm.get(c)){
                int count=0;
                int temp=c;
                while(hm.containsKey(temp)){
                    count++;
                    temp++;
                }
                if (count>size){
                    size=count;
                    ans=c;
                }
            }
        }
        for (int i=0;i<size;i++){
            System.out.print(ans+i+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,9,1,11,8,6,15,3,12,2};
        lcs(arr);
    }
}
