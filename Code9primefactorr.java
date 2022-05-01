package com.company.coding;

public class Code9primefactorr {
    public static void main(String[] args) {
        int  p= 2;
        int n= 46;
        while(p*p<=n){
            if(n%p==0){
                System.out.println(p);
                n=n/p;
            }else{
                p++;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
