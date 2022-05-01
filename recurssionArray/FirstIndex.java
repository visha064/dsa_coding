package com.company.coding.recurssionArray;

public class FirstIndex {

    public static int frist(int[] arr,int idx,int s){

        if (idx==arr.length-1){
            if (arr[idx]==s){
                return idx;
            }else{
                return -1;
            }
        }

        int x = frist(arr,idx+1,s);
        if (s==arr[idx]){
            x=idx;
        }
        return x;
    }

    public static void main(String[] args) {
        int [] arr ={3,45,2,43,65,45,33,2};
        System.out.println(frist(arr,0,29));
    }

}
