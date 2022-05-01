package com.company.coding.recursionup;

public class PrintEncoding {


    public static void printen(String str,String ans){


        char ch1 = str.charAt(0);
        int ch2 = Integer.parseInt(str.substring(0,2));
//        printen(str.substring(1),"a"-1+ch1);
    }

    public static void main(String[] args) {
        printen("123","");
    }
}
