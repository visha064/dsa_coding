package com.company.coding.array;

public class Code3barchart {
    public static void main(String[] args) {
        int [] arr = {1,3,9,0,3};
        int max = arr[0];
        for (int i = 0;i<5;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        for (int i =0; i<max;i++){
            for (int j=0;j<5;j++){
                if(arr[j]>=max-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
