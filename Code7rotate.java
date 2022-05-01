package com.company.coding;

public class Code7rotate {
    public static void main(String[] args) {
        int k=-6;
        int n = 12340;
        int s=0;
        int c = n;
        while(c>0){
            s++;
            c/=10;
        }
        System.out.println(s);
        k=k%s;
        System.out.println(k);
        if(k<0){
            k=s+k;
        } System.out.println(k);
        int d= n%(int)(Math.pow(10,k));
        n=n/(int)(Math.pow(10,k));
        c=n;
        s=0;
        while(c>0){
            s++;
            c/=10;
        }
        System.out.println((d*(int)Math.pow(10,s))+n);
    }
}
