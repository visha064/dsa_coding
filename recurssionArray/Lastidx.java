package com.company.coding.recurssionArray;

public class Lastidx {

    public static int last(int[] arr,int idx,int s){

        if (idx==arr.length-1){
            if (arr[idx]==s){
                return idx;
            }else{
                return -1;
            }
        }

        int x=last(arr,idx+1,s);
        if (x==-1&&arr[idx]==s){
            return idx;
        }else{
            return x;
        }
    }

    public static void main(String[] args) {
        int [] arr ={3,45,2,43,65,45,33,2};
        System.out.println(last(arr,0,48));
    }
}
