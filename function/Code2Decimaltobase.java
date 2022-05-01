package com.company.coding.function;

public class Code2Decimaltobase {

    static int decimaltobase(int n,int b){
        int c=0;
        int count =0;
        while(n>0){
             c=c+(n%b)*((int)Math.pow(10,count));
//            System.out.println(c);
             count++;
             n/=b;
        }
        return c;
    }

    public static void main(String[] args) {
        int d = decimaltobase(634,8);
        System.out.println(d);
    }
}
