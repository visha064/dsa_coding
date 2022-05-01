package com.company.coding.array;
import java.util.Scanner;
public class Code1Swap {

    public static int swap(int [] arr, int n){
        int max = arr[0];
        int min =arr[0];
        for (int i=0;i<n;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int d = swap(arr,n);
        System.out.println(d);
    }
}
