package com.company.coding.recurssionArray;

public class PrintReverse {
    public static void printArray(int[] arr,int idx){
        if(idx==-1){
            return ;
        }

        System.out.println(arr[idx]);
        printArray(arr,idx-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        printArray(arr,arr.length-1);
    }

}
