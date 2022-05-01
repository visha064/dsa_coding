package com.company.coding.recursionBack;

public class NQueen {

    public static boolean queenSafe(int[][] chess,int row,int col) {

        //vertically
        for (int i=row-1;i>=0;i--){
            if (chess[i][col]==1){
                return false;
            }
        }
        //diagonal left
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (chess[i][j]==1){
                return false;
                 }
        }
        //diagonal right
        for (int i=row-1,j=col+1;i>=0&&j< chess.length;i--){
            if (chess[i][j]==1){
                return false;}
            j++;
        }


        return true;
    }

    public static void queen(int[][] chess,int row,String ans){

        if (row== chess.length){
            System.out.println(ans);
            return;
        }

        for (int col=0;col< chess.length;col++) {
            if (queenSafe(chess,row,col)) {
                chess[row][col] = 1;
                queen(chess, row + 1, ans + "[" + row + "," + col + "]");
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n=4;
        int[][] chess = new int[n][n];
        queen(chess,0,"");
    }
}
