package com.company.coding.graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class HasPath {
    static class Edge{
        int src;
        int nhr;
        int wg;
        Edge(int src,int des,int wg){
            this.src=src;
            this.nhr=des;
            this.wg=wg;
        }
    }

    public static boolean havePath(ArrayList<Edge>[] graph,int s, int d,boolean[] visited){
        if (s==d){
            return true;
        }
        visited[s] = true;
        for (Edge ed:graph[s]){
            if (!visited[ed.nhr]){
            boolean hasnbrPath = havePath(graph,ed.nhr,d,visited);
            if (hasnbrPath){
                return true;
            }
        }

    } return false;}

    public static void allPath(ArrayList<Edge>[] graph,int s,int d,boolean[] visited,String ans){
        if (s==d){
            System.out.println(ans);
            return;
        }
        visited[s]=true;
        for (Edge ed:graph[s]){
            if (!visited[ed.nhr]){
                allPath(graph,ed.nhr,d,visited,ans+ed.nhr);
            }
        }
        visited[s]=false;

    }

    public static void main(String[] args) {
        int vec = 7;
        Scanner sc =new Scanner(System.in);
        vec=sc.nextInt();
        int ed = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vec];
        for (int i=0;i<vec;i++){
            graph[i]=new ArrayList<>();
        }
        for (int i=0;i<ed;i++){
            int s= sc.nextInt();
            int d= sc.nextInt();
            int w= sc.nextInt();
//            System.out.println(s+"->"+d);
            graph[s].add(new Edge(s,d,w));
//            System.out.println(d+"->"+s);
            graph[d].add(new Edge(d,s,w));
//            System.out.println("sir");

        }
        System.out.println(havePath(graph,1,50,new boolean[vec]));
        allPath(graph,1,5,new boolean[vec],1+"");
    }


       //7 8 0 1 10 0 3 10 1 2 10 3 2 10 3 4 10 4 5 10 5 6 10 6 4 10

}


