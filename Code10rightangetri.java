package com.company.coding;

public class Code10rightangetri {
    public static void main(String[] args) {
        int a= 3;
        int b= 4;
        int c= 52;
        int p = a>b?(a<c?c:a):(c>b?c:b);
        System.out.println(p);
        if(p==a){
            System.out.println(p*p==(c*c+b*b));
        }else if(p==b){
            System.out.println(p*p==(a*a+c*c));
        }else if(p==c){
            System.out.println(p*p==(a*a+b*b));
        }

    }
}
