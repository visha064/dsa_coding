package com.company.coding.function;

public class Code5add {

    static void add(int n1,int n2,int b){
        int d=0,count=0,c=0;
        while(n1>0||n2>0){
            int a = (n1%10)+(n2%10)+d;
            System.out.println(a);
            c=c+(a%5)*(int)Math.pow(10,count);
            System.out.println(c);
            d=a/b;
            System.out.println(d);
            n1=n1/10;
            n2=n2/10;
            count++;
            System.out.println();
        }
        System.out.println((d*(int)Math.pow(10,count))+c);
    }

    public static void main(String[] args) {
        add(234,343,5);
    }
}
