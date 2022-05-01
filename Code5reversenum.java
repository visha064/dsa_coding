package com.company.coding;

public class Code5reversenum {
    public static void main(String[] args) {
        int n = 234500;
        int x = 10;
        while(n>0){
            System.out.println(n%x);
            n=n/10;
        }
    }
}
