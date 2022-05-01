package com.company.coding;

public class Code24pattern13 {
    public static void main(String[] args) {
        int n =4;
        for (int i=0;i<n;i++){
            int val =1;
            for (int j=0;j<=i;j++){
                System.out.print(val+"\t");
                val = val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
