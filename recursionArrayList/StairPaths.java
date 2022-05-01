package com.company.coding.recursionArrayList;

import java.util.ArrayList;

public class StairPaths {

    public static ArrayList<String> stair(int n){

        if (n<0){
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }else if(n==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> path1 = stair(n-1);
        ArrayList<String> path2 = stair(n-2);
        ArrayList<String> path3 = stair(n-3);
        ArrayList<String> ans = new ArrayList<>();

        for (String s:path1){
            ans.add(1+s);
        }
        for (String s:path2){
            ans.add(2+s);
        }
        for (String s:path3){
            ans.add(3+s);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(stair(5));
    }
}
