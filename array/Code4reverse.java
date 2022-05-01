package com.company.coding.array;

public class Code4reverse {
    public static void main(String[] args) {
        int [] arr = {1,5,4,3,2,2,9};
        int i =0,j=arr.length-1;
        for (int k=1;k<arr.length/2;k++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }

    }
}
