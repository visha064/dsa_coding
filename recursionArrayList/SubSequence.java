package com.company.coding.recursionArrayList;

import java.util.ArrayList;

public class SubSequence {

    public static ArrayList<String> gss(String s){

        if (s.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        char ch = s.charAt(0);
        s=s.substring(1);

        ArrayList<String> rres = gss(s);
        ArrayList<String> ans = new ArrayList<>();
        for (String element:rres){
            ans.add(""+element);
            ans.add(ch+element);
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "asdf";
        System.out.println(gss(s));
    }
}
