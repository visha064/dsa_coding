package com.company.coding.recursionup;

public class GetMaze {

    public static void printmaze(int si,int sj,int di,int dj,String ans){

        if (si>di||sj>dj){
            return;
        }else if (si==di&&sj==dj){
            System.out.println(ans);
            return;
        }

        //horizontal
        printmaze(si,sj+1,di,dj,ans+"h");
        //vertical
        printmaze(si+1,sj,di,dj,ans+"v");

    }

    public static void main(String[] args) {
        printmaze(0,0,2,1,"");
    }
}
