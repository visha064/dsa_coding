package com.company.coding.stack;

import java.util.Stack;

public class NextLeftSmall {
    public static void main(String[] args) {
        int [] arr = {2,3,5,4,6,3,5,2};
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        ans[0]=-1;
        for (int i = 1;i<arr.length;i++){
            while(st.size()>0&&st.peek()>=arr[i]){
                st.pop();
            }
            if (st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }


}
