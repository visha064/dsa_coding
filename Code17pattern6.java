package com.company.coding;

public class Code17pattern6 {
    public static void main(String[] args) {
        int n =5;
        int st = n/2+1;
        int sp = 1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            for (int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();
            if (n/2>=i){
                st-=1;
                sp+=2;
            }else{
                st+=1;
                sp-=2;
            }
        }
    }
}
