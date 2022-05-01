package com.company.coding.stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {3,5,3,1,6,7,4,5,9,2,1};
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<arr.length;i++){
            int count=1;
            while(st.size()>0&&arr[i]>st.peek()){
                count++;
                st.pop();
            }
            if (st.size()==0){
                ans[i]=i+1;
            }else {
                ans[i]=count;
            }
            st.push(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
}
