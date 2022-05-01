package com.company.coding.array;

public class Code6inverse {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,0};
        int[] in = new int [arr.length];
        for (int i =0;i<=arr.length-1;i++){
            in[arr[i]]=i;
        }
        for (int i=0;i<=arr.length-1;i++)
        {System.out.print(in[i]+",");}
    }
}
