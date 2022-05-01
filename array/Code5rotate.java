package com.company.coding.array;

public class Code5rotate {
    public static void reverse(int arr [],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int arr[],int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }

        //p1
        reverse(arr,0,arr.length-k-1);
        //p2
        reverse(arr,arr.length-k,arr.length-1);
        //all reverse
        reverse(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int [] arr = {4,5,32,5,7};
        rotate(arr,-6);
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
