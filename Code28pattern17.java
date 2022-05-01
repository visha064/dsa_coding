package com.company.coding;

public class Code28pattern17 {
    public static void main(String[] args) {
        int n =15;
        int st = 1;
        for (int i =1 ; i<=n;i++){
            if (i!=n/2+1){
                for(int j =1;j<=n/2;j++){
                    System.out.print(" ");
                }}else{
                    for(int j=1;j<=n/2;j++){
                        System.out.print("*");
                    }}
                    for (int j=1;j<=st;j++){
                        System.out.print("*");
                    }
                    if(i<=n/2){
                        st++;
                    }else{
                        st--;
                    }
                    System.out.println();



        }
    }
}
