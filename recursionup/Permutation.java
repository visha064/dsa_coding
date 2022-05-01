package com.company.coding.recursionup;

public class Permutation {

    public static void printpm(String str,String ans){

        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i=0;i<str.length();i++){
            StringBuilder s= new StringBuilder(str);
            char ch = s.charAt(i);
            s.deleteCharAt(i);
            String st = new String(s);
            printpm(st,ans+ch);
        }

    }

    public static void main(String[] args) {
        printpm("abc","");
    }
}
