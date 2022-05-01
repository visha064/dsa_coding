package com.company.coding.string;
import java.util.*;
public class Ascii {
    public static String solution(String str){
        // write your code here
        char i=str.charAt(0);
        char j=str.charAt(1);
        System.out.println(str.length());
        StringBuilder s = new StringBuilder();
         s.append(str.charAt(0));
         if (j<str.length()){
             System.out.println("njygb");
         }
        while(j<str.length()){
            int c = j-i;
            s.append(c);
            s.append(j);
            i++;
            j++;
            System.out.println(i);
        }

        return s.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
