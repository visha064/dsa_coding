package com.company.coding.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,5,4,6,1,7,5,9};
        for (int itr =1;itr<=arr.length-1;itr++){
            int min = arr[itr-1];
            for (int j=itr;j<arr.length;j++){
                if (min>arr[j]){
                    int temp =arr[j];

                    arr[j]=min;
                    min=temp;
                }
                int temp =arr[itr];
                arr[itr]=min;
                min=temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
    }
}}
