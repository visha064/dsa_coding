package com.company.coding.recursionBack;

public class SumSubset {

    public static void sos(int[] arr,int idx,int sum,String ans,int target ) {
        if (sum==target){
            System.out.println(ans);
            return;
        }else if (sum>target||(idx==arr.length&&sum<target)){
            return;
        }
        int sum2=sum+arr[idx];
        String s = " "+arr[idx];
        sos(arr,idx+1,sum2,ans+s,target);
        sos(arr,idx+1,sum,ans,target);

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        sos(arr,0,0,"",60);
    }


}
