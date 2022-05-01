package com.company.coding.recursionArrayList;

import java.util.ArrayList;

public class GetMaze {

    public static ArrayList<String> maze(int si,int sj,int di,int dj){

        if (si>di||sj>dj){
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }
        else if (si==di&&sj==dj){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }


        //horizontal
        ArrayList<String> hpath = maze(si,sj+1,di,dj);
        //vertical
        ArrayList<String> vpath = maze(si+1,sj,di,dj);
        ArrayList<String> ans = new ArrayList<>();
        for (String s:hpath){
            ans.add("h"+s);
        }
        for (String s:vpath){
            ans.add("v"+s);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maze(0,0,2,3));
    }
}
