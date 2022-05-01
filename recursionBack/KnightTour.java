package com.company.coding.recursionBack;

public class KnightTour {

    public static void displayGame(int[][] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void knight(int[][] arr,int row,int col,String ans,int count) {
        if (row<0||col<0||row>=arr.length||col>=arr.length||arr[row][col]>0){
            return;
        }
        else if (count== arr.length* arr.length){
            arr[row][col]=count;
            displayGame(arr);
            arr[row][col]=0;
        }

        arr[row][col]=count;
        knight(arr,row-2,col+1,ans,count+1);
        knight(arr,row-1,col+2,ans,count+1);
        knight(arr,row+1,col+2,ans,count+1);
        knight(arr,row+2,col+1,ans,count+1);
        knight(arr,row+2,col-1,ans,count+1);
        knight(arr,row+1,col-2,ans,count+1);
        knight(arr,row-1,col-2,ans,count+1);
        knight(arr,row-2,col-1,ans,count+1);
        arr[row][col]=0;
    }

    public static void main(String[] args) {
        int n =5;
        int[][] arr = new int[n][n];
        knight(arr,2,4,"",1);
        //2 and 4 initial move
    }
}
