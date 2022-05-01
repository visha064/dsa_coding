package com.company.coding.recursionArrayList;

import java.util.ArrayList;

public class GetKPC {


    public static ArrayList<String> getKCp(String str){

        if (str.length()==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        int ch = (str.charAt(0));
        str = str.substring(1);

        ArrayList<String> rres = getKCp(str);
        ArrayList<String> ans = new ArrayList<>();
        String[] key = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        for (int i=0;i<key[ch-'0'].length();i++) {
            for (String element : rres) {
                ans.add(key[ch-'0'].charAt(i) +element);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String str = "123460";
        System.out.println(getKCp(str));
    }
}
