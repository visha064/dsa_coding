package com.company.coding;

public class Code23pattern12 {
    public static void main(String[] args) {
        int pr=0;
        int nx=1;
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(pr+"\t");
                int temp = pr;
                pr = nx;
                nx = pr+temp;
            }
            System.out.println();
        }
    }
}
