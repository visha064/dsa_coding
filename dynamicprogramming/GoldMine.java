package com.company.coding.dynamicprogramming;

public class GoldMine {


    public static int gold(int[][] arr,int[][] mine) {
        int ans=Integer.MIN_VALUE;

        for (int j=arr[0].length-1;j>=0;j--){
                for (int i = arr.length-1; i >=0; i--) {
                    if(j==arr[0].length-1){
                        mine[i][j] = arr[i][j];
                    }
                    else if (i == 0) {
                        int r = mine[i][j + 1];
                        int br = mine[i + 1][j + 1];
                        mine[i][j] = Math.max(r, br) + arr[i][j];

                    } else if (i == arr.length - 1) {
                        int tr = mine[i - 1][j + 1];
                        int r = mine[i][j + 1];

                        mine[i][j] = Math.max(tr, r) + arr[i][j];

                    } else {
                        int tr = mine[i - 1][j + 1];
                        int r = mine[i][j + 1];
                        int br = mine[i + 1][j + 1];
                        mine[i][j] = Math.max(Math.max(tr, r), br) + arr[i][j];

                    }
                }

        }


        for (int i=0;i<arr.length;i++){
            if (ans<mine[i][0]){
                ans=mine[i][0];
            }

        }

//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                System.out.print(mine[i][j]+" ");
//            }
//            System.out.println();
//        }
        return ans;
    }


    public static void main(String[] args) {
        int [][] arr = {{0,1,4},{4,3,6},{1,2,4},{2,0,7}};
        int[][] mine = new int[arr.length][arr[0].length];
        int ans = gold(arr,mine);
        System.out.println(ans);
    }
}
