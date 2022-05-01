package com.company.coding;

public class Code6inverse {
    public static void main(String[] args) {
        int p=0;
        int n=15234;
        int count = 0;
        while(n>0){
            count++;
            int z = n%10;
            p+=((int)(Math.pow(10,z-1))*count);
            n/=10;
        }
        System.out.println(p);
        System.out.println((-11)%10);
    }
}
