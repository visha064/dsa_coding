package com.company.coding.stack;

import java.util.Stack;

public class NextRight1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int [] arr = {1,5,4,6,3,7,2,9};
        int [] ans = new int[arr.length];
        st.push(0);
        for (int i=1;i<arr.length;i++){
            while (st.size()>0&&arr[i]>=arr[st.peek()]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            ans[st.peek()]=-1;
            st.pop();
        }
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
