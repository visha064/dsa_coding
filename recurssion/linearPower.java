package com.company.coding.recurssion;

public class linearPower {

    public static int lp(int x,int n){
        if (n==0){
            return 1;
        }
        return x*lp(x,n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        int x=2;
        System.out.println(lp(x,n));
    }

}
