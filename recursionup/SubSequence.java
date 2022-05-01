package com.company.coding.recursionup;

public class SubSequence {

    public static void printss(String str,String ans){

        if (str.length()==0){
            System.out.print(ans+",");
            return;
        }

        char ch = str.charAt(0);
        str = str.substring(1);

        printss(str,""+ans);
        printss(str,ans+ch);


    }

    public static void main(String[] args) {
        printss("abc","");
    }
}
