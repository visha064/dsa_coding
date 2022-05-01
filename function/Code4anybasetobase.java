package com.company.coding.function;

public class Code4anybasetobase {

    static int basetodecimal(int n, int b){
        int c=0,count=0;
        while(n>0){
            c+=(n%10)*((int)Math.pow(b,count));
            count++;
            n/=10;
        }
        return c;
    }
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
    static int basetibase(int n,int b1,int b2){
        return(decimaltobase(basetodecimal(n,b1),b2));
    }

    public static void main(String[] args) {
        int d =basetibase(634,10,8);
        System.out.println(d);
    }
}
