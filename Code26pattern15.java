package com.company.coding;

import java.util.logging.SimpleFormatter;

public class Code26pattern15 {
    public static void main(String[] args) {
        int n = 6;
        int st = 1;
        int sp = n/2;
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            int k = count;
            for (int j=1;j<=st;j++){
                System.out.print(k);
                if (j<=st/2){
                    k++;
                }else{
                    k--;
                }
            }


            System.out.println();

            if(i<=n/2){
                st+=2;
                sp-=1;
                count++;
            }else{
                st-=2;
                sp+=1;
                count--;
            }

        }
    }
}
