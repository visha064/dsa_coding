package com.company.coding.hashmap;

import java.util.HashMap;

public class MaxFreq {

    public static Character maxf(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i =0;i<str.length();i++){
            if (hm.containsKey(str.charAt(i))){
                int count = hm.get(str.charAt(i));
                count++;
                hm.put(str.charAt(i),count);
            }else {
                hm.put(str.charAt(i),1);
            }
        }
        char ans = str.charAt(0);
        for (char ch : hm.keySet()){
            if (hm.get(ch)>hm.get(ans)){
                ans=ch;
            }
        }
        return ans;
    }

    public static void getcommonele(String str1,String str2){
        HashMap<Character,Integer> hm= new HashMap<>();
        for (int i=0;i<str2.length();i++){
            if (!hm.containsKey(str2.charAt(i))){
                hm.put(str2.charAt(i),0);
            }
        }
        for (int i=0;i<str1.length();i++){
            if (hm.containsKey(str1.charAt(i))){
                int c = hm.get(str1.charAt(i));
                c++;
                hm.put(str1.charAt(i),c);
            }
        }
        for (char ch:hm.keySet()){
            if (hm.get(ch)>0){
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcbbacccbcbaaabcbbbbaaaaaaaaaa";
        String s="qwewwwabbbabababq";
        System.out.println(maxf(str));
        getcommonele(str,s);
    }
}
