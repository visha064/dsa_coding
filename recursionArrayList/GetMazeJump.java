package com.company.coding.recursionArrayList;

import java.util.ArrayList;

public class GetMazeJump {

    public static ArrayList<String> mazeJump(int si,int sj,int di,int dj){

        if (si>di||sj>dj){
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }else if (si==di&&sj==dj){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> ans = new ArrayList<>();
        //Horizontal
        for (int h=1;h<=dj-sj;h++){
            ArrayList<String> hpath = mazeJump(si,sj+h,di,dj);
            for ( String s:hpath){
                ans.add("h"+h+s);
            }
        }
        //vertical
        for (int v=1;v<=di-si;v++){
            ArrayList<String> vpath = mazeJump(si+v,sj,di,dj);
            for ( String s:vpath){
                ans.add("v"+v+s);
            }
        }
        //diaginal
        for (int d=1;d<=dj-sj&&d<=di-si;d++){
            ArrayList<String> dpath = mazeJump(si+d,sj+d,di,dj);
            for ( String s:dpath){
                ans.add("d"+d+s);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(mazeJump(0,0,3,3));
    }
}
