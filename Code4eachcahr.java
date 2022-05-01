package com.company.coding;

public class Code4eachcahr {

    public static void eachInt(int n){
        int x =n;
        int count =0;
        while(x>0){
            x=x/10;
            count++;
        }
        x=(int)Math.pow(10,count-1);

        while(x>0){
            int c=0;
            System.out.println(n/x);
            n=n%x;
            x/=10;
            
        }

    }

    public static void main(String[] args) {
eachInt(5600);
    }
}
