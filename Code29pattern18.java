package com.company.coding;

public class Code29pattern18 {
    public static void main(String[] args) {
        int n = 7;
        int st = n;
        int os = 0;
        int is = n/2;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=os;j++){
                System.out.print(" ");
            }
            if (1<i&&i<=n/2)
            {
                System.out.print("*");
                for (int j=1;j<=is;j++){
                System.out.print(" ");
            }System.out.print("*");
                is-=2;
            }else
            for (int j=1;j<=st;j++){
                System.out.print("*");
            }


            if (i<=n/2){
                st-=2;
                os++;

            }else{
                st+=2;
                os--;
            }
            System.out.println();
        }
    }
}



