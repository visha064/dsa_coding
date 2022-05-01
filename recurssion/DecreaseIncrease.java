package com.company.coding.recurssion;

public class DecreaseIncrease {

    public static void decinc(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        decinc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 7;
        decinc(n);
    }
}
