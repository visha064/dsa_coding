package com.company.coding.recursionup;

public class GetMazeJump {

    public static void printmazejump(int si,int sj,int di,int dj,String ans){

        if (si>di||sj>dj){
            return;
        }else if (si==di&&sj==dj){
            System.out.println(ans);
            return;
        }


        for (int i=1;i<=dj-sj;i++){
            printmazejump(si, sj+i, di, dj, ans+"h"+i);
        }
        for (int i=1;i<=di-si;i++){
            printmazejump(si+i, sj, di, dj, ans+"v"+i);
        }
        for (int i=1;i<=dj-sj&&i<=di-si;i++){
            printmazejump(si+i, sj+i, di, dj, ans+"d"+i);
        }

    }

    public static void main(String[] args) {
        printmazejump(0,0,3,3,"");
    }
}
