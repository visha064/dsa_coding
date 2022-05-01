package com.company.coding.recursionup;

public class GetKPC {

    static String[] key = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printkpc(String str,String ans){

        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        str=str.substring(1);
        for (int i=0;i<key[ch-'0'].length();i++){
            printkpc(str,ans+key[ch-'0'].charAt(i));
        }


    }

    public static void main(String[] args) {
        printkpc("123","");
    }
}
