package com.company.coding.binarysearchtree;

public class BST {

    public static class Node{
        int data;
        Node left;
        Node right;

    }
    public static Node construct(int[] arr,int l,int h){
        if (l>h){
            return null;
        }
        int mid = (l+h)/2;
        Node lst = construct(arr,l,mid-1);
        Node rst = construct(arr,mid+1,h);
        Node node = new Node();
        node.data=arr[mid];
        node.left=lst;
        node.right=rst;
        return node;

    }

    public static void display(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        display(node.left);
        display(node.right);
    }

    public static Node add(Node node,int a){
        if (node==null){
            Node newNode = new Node();
            newNode.data=a;
            return newNode;
        }
        if (node.data>a){
            Node temp = add(node.left,a);
            node.left=temp;
        }else if (node.data<a){
            Node temp = add(node.right,a);
            node.right=temp;
        }
        return node;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        Node root=construct(arr,0,arr.length-1);
        display(root);
        System.out.println();
        root= add(root,1);
        display(root);
    }
}
