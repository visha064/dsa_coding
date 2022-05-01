package com.company.coding;

public class Code27pattern16 {
    public static void main(String[] args) {
        int n = 15;
        int sp = 2*n-3;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            if(i<n)
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }else{
                for(int j=i-1;j>=1;j--){
                    System.out.print(j);
                }
            }
            System.out.println();
            sp-=2;
        }
    }
}
