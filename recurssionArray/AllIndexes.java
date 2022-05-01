package com.company.coding.recurssionArray;

public class AllIndexes {

    public static int[] allidx(int[] arr,int idx ,int s,int f){

        if (idx==arr.length){
            int [] ans = new int [f];
            return ans;
        }

        if (arr[idx]==s)
        {
            f++;
        }
        int [] ans = allidx(arr,idx+1,s,f);

        if (arr[idx]==s){
            ans[f-1]=idx;
            f--;
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,45,5,6,45,65,5,23,5};
        int [] ans = allidx(arr,0,45,0);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
