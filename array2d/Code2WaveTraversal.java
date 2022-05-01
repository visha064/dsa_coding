package com.company.coding.array2d;
import java.util.Scanner;

public class Code2WaveTraversal {
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

        for (int i=0;i<arr[0].length;i++){

            if (i%2==0)
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j][i]);
            }
            else{
                for (int j=arr.length-1;j>=0;j--){
                    System.out.println(arr[j][i]);
                }
            }
        }

    }
}
