package com.company.coding.stack;

import java.util.Stack;

public class DuplicateBracket {

    public static void main(String[] args) {

        String str = "(a+b)+((c+d)+o)";
        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch==')'){
                if (st.peek()=='('){
                    System.out.println(true);
                    return;
                }else {
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
