package com.company.coding.array2d;
import java.util.Scanner;
public class Code1matrixmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] arr1 = new int[a][b];
        for (int i = 0;i<a;i++){
            for (int j=0;j<b;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        int c = sc.nextInt();
        int d = sc.nextInt();
        int [][] arr2 = new int[a][b];
        for (int i = 0;i<c;i++){
            for (int j=0;j<d;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        if (b!=c){
            System.out.println("cannot multiply");
        }else{
            int [][] arr3 = new int [a][d];
            for (int i=0;i<arr3.length;i++){
                for (int j =0;j<arr3[0].length;j++){
                    for (int k=0;k<b;k++){
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }

            for (int i=0;i<arr3.length;i++){
                for (int j =0;j<arr3[0].length;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }

        }

    }
}
