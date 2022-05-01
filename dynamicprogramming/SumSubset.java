package com.company.coding.dynamicprogramming;

public class SumSubset {

    public static boolean sos(int[] arr, boolean[][] ans,int target){

        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                if (i==0&&j==0){
                    ans[i][j]=true;
                }else if (j==0){
                    ans[i][j]=true;
                }else if (i==0){
                    ans[i][j]=false;
                }else{
                    if (ans[i-1][j]){
                        ans[i][j]=true;
                    }else{
                        if(j>=arr[i-1]&&ans[i-1][j-arr[i-1]]){
                            ans[i][j]=true;
                        }
                    }
                }
            }
        }
        for (int i=0;i< ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        return ans[ans.length-1][ans[0].length-1];
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,1,5};
        int target = 10;
        boolean[][] ans = new boolean[arr.length+1][target+1];
        boolean fans = sos(arr,ans,target);
        System.out.println(fans);
    }
}
