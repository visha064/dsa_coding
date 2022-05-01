package com.company.coding.generictrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Size {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int getsize(Node node){

        if (node.children.size()==0){
            return 1;
        }

        //faith
        int size =0;
        for (Node child:node.children){
              size=size+getsize(child);
        }
        size++;
        return size;
    }

    public static int maximum(Node node){
        if (node.children.size()==0){
            return node.data;
        }

        //faith
        int m = node.data;
        for (Node child:node.children){
            m = Math.max(m,maximum(child));
        }
        return m;

    }

    public static int height(Node node){
        int h=0;
        for (Node child: node.children){
            h=Math.max(h,height(child));
        }
        h++;
        return h;
    }

    public static void traversal(Node node){
        System.out.println("NodePre "+node.data);
        for (Node child :node.children){
            System.out.println("EdgePre "+node.data+"-"+child.data);
            traversal(child);
            System.out.println("EdgePost "+node.data+"-"+child.data);
        }
        System.out.println("Post "+node.data);
    }
    //remove print add
    public static void traversalQueue(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while(que.size()>0){
            Node t =que.remove();
            System.out.print(t.data+",");
            for (Node child:t.children){
                que.add(child);
            }

        }
    }

    public static void levelOrderLinewise(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        Queue<Node> p = new ArrayDeque<>();
        while(q.size()>0){
            node =  q.remove();
            System.out.println(node.data);

        }
    }

    public static void zigzag(Node node){
        Stack<Node> org = new Stack<>();
        Stack<Node> extra = new Stack<>();
        org.push(node);
        int lvl=1;
        while(org.size()>0){
            Node t = org.pop();
            System.out.print(t.data);
            if (lvl%2==1) {
                for (int i = 0; i < t.children.size(); i++) {
                    extra.push(t.children.get(i));
                }
            }else{
                    for (int i=t.children.size()-1;i>=0;i--){
                        extra.push(t.children.get(i));
                    }
                }

            if (org.size()==0){
                org=extra;
                extra=new Stack<>();
                lvl++;
                System.out.println();
            }
        }
    }

    public static boolean search(Node node,int s){
        if (s==node.data){
            return true;
        }else{
            for (Node child : node.children){
                if (search(child,s)){
                    return true;
                }
                }
            return false;
            }
        }


    public static void main(String[] args) {
        Node root=null;
        Stack<Node> st = new Stack<>();
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        for (int i=0;i< arr.length;i++){
            if (arr[i]==-1){
                st.pop();
            }
            else {Node t = new Node();
                t.data=arr[i];
                if (st.size()>0){
                        st.peek().children.add(t);
                        st.push(t);
                }else{
                    root = t;
                    st.push(root);
                }
            }
        }

        System.out.println(getsize(root));
        System.out.println(maximum(root));
        System.out.println(height(root));
        zigzag(root);
        System.out.println(search(root,0));
    }
}
