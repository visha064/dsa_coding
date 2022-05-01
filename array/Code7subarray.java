package com.company.coding.array;

public class Code7subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,34};
        for (int i =0;i<arr.length;i++){
            for (int j=i;j< arr.length;j++){
                for (int k = i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
        }
    }
}
