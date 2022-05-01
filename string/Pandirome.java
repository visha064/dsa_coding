package com.company.coding.string;

public class Pandirome {

    public static boolean ispandirome(String s){
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            if (s.charAt(i)!=s.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbccbbafghal";
        for (int i =0;i<=s.length()-1;i++){
            for (int j=i+1;j<=s.length();j++){
                if (ispandirome(s.substring(i,j)))
                System.out.println(s.substring(i,j));
            }
        }

    }
}
