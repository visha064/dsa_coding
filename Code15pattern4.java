package com.company.coding;

public class Code15pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
