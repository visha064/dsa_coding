package com.company.coding;

public class Code16pattern5 {
    public static void main(String[] args) {
        int n=4;
        int sp=n/2;
        int st=1;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*");
            }
            System.out.println();

            if(i<=n/2){
                sp-=1;
                st+=2;
            }else{
                sp+=1;
                st-=2;
            }

        }
    }
}
