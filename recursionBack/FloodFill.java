package com.company.coding.recursionBack;

public class FloodFill {

    public static void flood(int row,int col,int[][] arr,String ans,boolean[][] visited){

        if (row<0||col<0||row== arr.length||col==arr[0].length||arr[row][col]==1||visited[row][col]==true){
            return;
        }else if (col==arr[0].length-1&&row== arr.length-1){
            System.out.println(ans);
            return;
        }

        visited[row][col] = true;
        flood(row-1,col,arr,ans+"t",visited);
        flood(row,col-1,arr,ans+"l",visited);
        flood(row+1,col,arr,ans+"d",visited);
        flood(row,col+1,arr,ans+"r",visited);
        visited[row][col]=false;

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,1},{0,1,0},{0,0,0},{0,1,0},{0,0,0}};
        boolean[][] visited = new boolean[arr.length][arr[0].length];

        flood(0,0,arr,"",visited);
    }
}
