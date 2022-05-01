package com.company.coding.recurssionArray;

public class Max {
    public static int max(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int a = max(arr,idx+1);
        if (a>arr[idx]){
            return a;
        }else{
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        int[] arr={11,23,32,43,65,22,54,69};
        System.out.println(max(arr,0));
    }
}
