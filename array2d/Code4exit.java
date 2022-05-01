package com.company.coding.array2d;
import java.util.Scanner;
public class Code4exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] arr = new int [a][b];

        for (int i =0;i<a;i++){
            for (int j = 0 ;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int i=0,j=0;
        int dir = 0;

        while(i<arr.length&&i>=0&&j<arr[0].length&&j>=0){
            if(arr[i][j]==1){
                dir++;
            }
            dir%=4;
            System.out.println(i+" "+j);
            if(dir==0){
                j++;
            }else if (dir==1){
                i++;
            }else if (dir==2){
                j--;
            }else if (dir==3){
                i--;
            }

        }
        if (i==-1)i++;
        else if(i== arr.length)i= arr.length-1;
        else if (j==-1)j++;
        else if(j== arr[0].length)j= arr[0].length-1;
        System.out.println(i+" "+j);

    }
}
