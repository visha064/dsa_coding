package com.company.coding.generictrees;
import java.util.*;

public class Display {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node){
        System.out.print(node.data+"->");
        for (Node child:node.children){
            System.out.print(child.data+",");
        }
        System.out.print(".");
        System.out.println();

        for (Node child:node.children){
            display(child);
        }

    }

    public static void main(String[] args) {
        Node root=null;
        Stack<Node> st = new Stack<>();
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        for (int i=0;i< arr.length;i++){
            if (arr[i]==-1){
                st.pop();
            }else{
                Node temp = new Node();
                temp.data=arr[i];
                if (st.size()>0){
                    st.peek().children.add(temp);
                    st.push(temp);
                }else{
                    root=temp;
                    st.push(root);
                }
            }
        }
        display(root);
    }
}
