package com.company.coding.recurssion;

public class TowerOfHannoi {

    public static void toh(int n,int a,int b,int c){
        if(n==0){
            return ;
        }
        toh(n-1,a,c,b);
        System.out.println(n+"["+a+"->"+b+"]");
        toh(n-1,c,b,a);
    }

    public static void main(String[] args) {
        toh(3,1,2,3);
    }

}
