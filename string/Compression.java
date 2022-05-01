package com.company.coding.string;

public class Compression {

    public static String compress(String s){
        int i =0,j=1;
        String ans ="";
        int count =1;
        ans+=s.charAt(i);
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                if (count>1)
                {
                    ans=ans+count+s.charAt(j);
                    count=1;
                }else{
                ans+=s.charAt(j);}
            }
            else{
                count++;
            }
            i++;
            j++;
        }
        if (count>1){
            ans+=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s ="jfakjdflkajfljdsjjjjjalsasssslfjdkjflafjjjjl";
        String ans = compress(s);
        System.out.println(ans);
    }
}
