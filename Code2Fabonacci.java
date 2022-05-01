package com.company.coding;


import java.util.Scanner;

public class Code2Fabonacci {

    public static int[] fabonnaci(int x){
        int [] arr = new int[x];
        switch (x){
        case 1:arr[0]=0;
        case 2:arr[1]=1;
        default:{
            arr[0]=0;
            arr[1]=1;
            for (int i=2;i<x;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
    }
    return arr;
    }

    public static void main(String[] args) {
            int [] arr = fabonnaci(50);
        for (int element:arr) {
            System.out.println(element);
        }
    }

    public static class Code1 {

        public static boolean isPrime(int x){
            int count = 0;
            for (int i=2;i*i<=x;i++){
                if(x%i==0){
                    count++;
                }
            }if (count==0){
                return true;
            }else
                return false;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter high and low ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i=a;i<=b;i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }

        }
    }
}
