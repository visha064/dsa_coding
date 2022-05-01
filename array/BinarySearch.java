package com.company.coding.array;

public class BinarySearch {

    public static void binarySearch(int [] arr,int n){
        int l=0,h=arr.length-1,li=-1;
        boolean find = false;
        while(l<=h){
            int m = (l+h)/2;
            if (arr[m]>n){
                h=m-1;
            }else if (arr[m]<n){
                l=m+1;
            }else{
                System.out.println(m);
//                find = true;
//                l=h=m;
//                break;
                li=m;
                l=m+1;
            }

        }
        System.out.println(l+","+h+","+li);
        if (!find){
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,8,8,8,8,8,8,9,10};
        binarySearch(arr,8);
    }
}
