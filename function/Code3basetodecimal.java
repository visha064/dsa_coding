package com.company.coding.function;

public class Code3basetodecimal {

    static int basetodecimal(int n, int b){
        int c=0,count=0;
        while(n>0){
            c+=(n%10)*((int)Math.pow(b,count));
            count++;
            n/=10;
        }
        return c;
    }

    public static void main(String[] args) {
        int d = basetodecimal(1172,8);
        System.out.println(d);
    }
}
