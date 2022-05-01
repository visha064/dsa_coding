package com.company.coding;

public class Code21pattern10 {
    public static void main(String[] args) {
        int n = 12;
        int os =n/2;
        int is = -1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<=is;j++){
                System.out.print(" ");
            }if (is>0){
                System.out.print("*");}
            System.out.println();
                if (n/2>=i){
                    os-=1;
                    is+=2;
                }else{
                    os+=1;
                    is-=2;
                }

        }
    }
}
