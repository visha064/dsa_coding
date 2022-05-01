package com.company.coding.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {2,5,4,6,1,7,5,9};
        for (int itr=1;itr<=arr.length-1;itr++){
            for (int i=0;i< arr.length-itr;i++){
                if (arr[i]>arr[i+1]){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
