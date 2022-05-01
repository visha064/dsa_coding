package com.company.coding;

public class Code8gcdlcm {
    public static void main(String[] args) {
        int n1=36,n2=24;
        int p1=n1,p2=n2;
        while(p1%p2!=0){
            int temp = p1%p2;
            p1= p2;
            p2=temp;
        }
        System.out.println("GCD "+p2);
        System.out.println("LCM "+(n1*n2/p2));

    }
}
