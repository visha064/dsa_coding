package com.company.coding.sort;

import java.util.*;

public class QuickSelect {


    public static int select(int[] arr,int l,int h,int k){
        int p = partititon(arr,l,h,arr[h]);
        if (p>k){
            return select(arr,l,p-1,k);
        }else if (p>k){
            return select(arr,p+1,h,k);
        }else{
            return arr[p];
        }
    }

    public static int partititon(int [] arr,int l,int h,int p){
        int i=l,j=l;
        while(i<=h){
            if (arr[i]>p)
                i++;
            else{
                int temp = arr[i];
            }

        }return 0;
    }


    public static void main(String[] args) {
        int arr [] = {2,3,41,5,55,6};
//        int ans = select(arr,0,arr.length-1,3-1);
//        System.out.println(ans);
        System.out.println(Integer.parseInt("0016"));
    }
}
