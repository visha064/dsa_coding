package com.company.coding.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TreeConstructor {

    public static class Node{
        int data;
        Node left;
        Node right;
    }

    public static class Pair{
        int state;
        Node node;
        Pair(int state,Node node){
            this.state=state;
            this.node=node;
        }
        Pair(){

        }
    }

    public static void travesal(Node node){
        Queue<Node> que = new ArrayDeque<>();
        que.add(node);
        while(que.size()>0){
            int count = que.size();

            for (int i=0;i<count;i++){
                Node temp = que.remove();
                System.out.print(temp.data);
                if (temp.left!=null){
                    que.add(temp.left);
                }
                if (temp.right!=null){
                    que.add(temp.right);
                }
            }
            System.out.println();

        }

    }
    public static int size(Node node){
        if (node==null){
            return 0;
        }
        int s=0;
        s=size(node.left)+size(node.right);
        s++;
        return s;
    }

    public static void constructor(Node node,Integer[] arr){
        node.data=arr[0];
        Stack<Pair> st = new Stack<>();
        Pair pr = new Pair(1,node);
        st.push(pr);
        int idx=1;
        while(st.size()>0){
            //left join
            if (st.peek().state==1){
                if (arr[idx]!=null){
                    Node ln = new Node();
                    ln.data=arr[idx];
                    st.peek().node.left=ln;
                    st.peek().state++;
                    Pair lpr = new Pair(1,ln);
                    st.push(lpr);
                }else{
                    st.peek().state++;
                }
                idx++;
            }
            //right join
            else if (st.peek().state==2){
                if (arr[idx]!=null){
                    Node ln = new Node();
                    ln.data=arr[idx];
                    st.peek().node.right=ln;
                    st.peek().state++;
                    Pair lpr = new Pair(1,ln);
                    st.push(lpr);
                }else{
                    st.peek().state++;
                }
                idx++;
            }
            //pop
            else{
                st.pop();
            }

        }
    }

    public static void display(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.left!=null?""+node.left.data:".");
        System.out.print(node.data);
        System.out.print(node.right!=null?""+node.right.data:".");
        System.out.println();
        display(node.left);
        display(node.right);
    }

    public static void display1(Node node){
        if (node==null){
            return;
        }
        System.out.println("pre"+node.data);
        display1(node.left);
        System.out.println("in"+node.data);
        display1(node.right);
        System.out.println("post"+node.data);
    }

    public static void queueDisplay(Node node){
        Stack<Pair> st = new Stack<>();
        st.add(new Pair(1,node));
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        while(st.size()>0){
            if (st.peek().state==1){  //preoder
                pre.add(st.peek().node.data);
                st.peek().state++;
                if (st.peek().node.left!=null){
                    st.push(new Pair(1,st.peek().node.left));
                }
            }else if(st.peek().state==2){ //inorder
                in.add(st.peek().node.data);
                st.peek().state++;
                if (st.peek().node.right!=null){
                    st.push(new Pair(1,st.peek().node.right));
                }
            }else if(st.peek().state==3){ //postorder
                post.add(st.peek().node.data);
                st.pop();

            }
        }
        System.out.print("pre->");
        for (int i=0;i<pre.size();i++){
            System.out.print(pre.get(i));
        }
        System.out.println();
        System.out.print("in->");
        for (int i=0;i<pre.size();i++){
            System.out.print(in.get(i));
        }
        System.out.println();
        System.out.print("post->");
        for (int i=0;i<pre.size();i++){
            System.out.print(post.get(i));
        }
        System.out.println();
    }

    static ArrayList<Integer> path = new ArrayList<>();
    public static boolean rootpath(Node node,int s){

        if (node==null){
            return false;
        }

        if (node.data==s){
            path.add(node.data);
            return true;
        }

        else if (rootpath(node.left,s)||rootpath(node.right,s)){
            path.add(node.data);
            return true;
        }else{
            return false;
        }
    }

    public static void kPath(Node node,int k){

        if (k<0||node==null){
            return ;
        }
        if (k==0){
            System.out.print(node.data);
            return;
        }

        kPath(node.left,k-1);
        kPath(node.right,k-1);
    }

    public static int diameter(Node node){

        if (node.right==null&&node.left==null){
            return 0;
        }
        int l = diameter(node.left);
        int r = diameter(node.right);
        if (l==0&&r>0){
            return r+1;
        }else if (l>0&&r==0){
            return l+1;
        }else{
            return l+r+2;
        }
    }

    public static Node clone(Node node){
        if (node==null){
            return null;
        }

        Node l = clone(node.left);
        Node r = clone(node.right);
        Node temp = new Node();
        temp.data=node.data;
        node.left=temp;
        temp.left=l;
        node.right=r;
        return node;

    }

    public static Node deClone(Node node){
        if (node==null){
            return null;
        }
        Node l = deClone(node.left.left);
        Node r = deClone(node.right);
        node.left=l;
        node.right=r;
        return node;
    }

    public static void singleChild(Node node){
        if (node==null){
            return;
        }
        if (node.left==null&&node.right!=null){
            System.out.print(node.right.data+" ");
        }else if (node.left!=null&&node.right==null){
            System.out.print(node.left.data+" ");
        }
        singleChild(node.left);
        singleChild(node.right);
    }

    public static Node removeLeaves(Node node){
        if (node == null){
            return null;
        }

        if (node.right!=null){
            if (node.right.right==null&&node.right.left==null){
                node.right=null;
            }else
            {
                node.right=removeLeaves(node.right);
            }
        }
        if (node.left!=null){
            if (node.left.right==null&&node.left.left==null){
                node.left=null;
            }else
            {
                node.left=removeLeaves(node.left);
            }
        }

        return node;
    }

    static int h1 ;
    static int h2 ;
    public static void diametertree(Node node , int d){
        if (node==null){
            return;
        }

        if (h1<=d){
            h2=h1;
            h1=d;
        }
        diametertree(node.left,d+1);
        diametertree(node.right,d+1);
        System.out.println(h1+h2);

    }

    public static void main(String[] args) {
        Node root=new Node();

        Integer[] arr = {1,2,4,8,null,null,null,5,null,null,3,6,null,null,7,null,null};
//        Integer[] arr = {1,2,4,null,null,null,3,null,null};
        constructor(root,arr);
//        display1(root);
//        travesal(root);
//        System.out.println(size(root));
//        System.out.println(root.left.right);
        queueDisplay(root);
        rootpath(root,3);
        System.out.println(path);
        kPath(root,2);
//        System.out.println(diameter(root));
        root=clone(root);
        queueDisplay(root);
        root = deClone(root);
        queueDisplay(root);
        travesal(root);
        System.out.println("-----");
//        root = removeLeaves(root);
//        travesal(root);
        diametertree(root,0);
        System.out.println("h1- "+h1+" h2- "+h2);
    }
}
