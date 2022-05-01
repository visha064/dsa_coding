package com.company.coding.linkedList;

public class LinkedLIst {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addlast(int n){
            Node temp = new Node();
            temp.data = n;

            if (size==0){
                head = tail = temp;
                size++;
            }
            else{
                tail.next=temp;
                tail=temp;
                size++;
            }

        }

        public void display(){
            Node temp=head;
            for (int i=0;i<size;i++){
                System.out.println(temp.data+","+temp);
                temp=temp.next;
            }

        }

        public int getSize(){
            return size;
        }

        public void removeFirst(){
            if (size==0){
                System.out.println("list is empty");
            }else if(size==1){
                head = tail = null;
                size--;
            }else{
                head = head.next;
                size--;
            }
        }
        public void removeLast(){
            if (size==0){
                System.out.println("list is empty");
            }else if(size==1){
                head = tail = null;
                size--;
            }else{
                Node temp=head;
                while(temp.next!=tail){
                    temp=temp.next;
                }
                tail=temp;
                tail.next=null;
                size--;
            }
        }
        public void removeAt(int idx){
            if (idx<0||idx>=size){
                System.out.println("invalid arguments");
            }else if (idx==0){
                removeFirst();
            }else if (idx==size-1){
                removeLast();
            }else{
                Node temp=head;
                for (int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                size--;
            }
        }

        public int getFirst(){
            if (size==0){
                System.out.println("empty list");
                return -1;
            }else{
                return head.data;
            }
        }

        public int getLast(){
            if (size==0){
                System.out.println("empty list");
                return -1;
            }else{
                return tail.data;
            }
        }

        public int getAt(int idx){
            if (size==0){
                System.out.println("empty list");
                return -1;
            }
            else if (idx<0||idx>=size){
                System.out.println("invalid arguments");
                return -1;
            }else{
                Node temp = head;
                for (int i=0;i<idx;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int n){
            Node temp =new Node();
            temp.data = n;
            if (size==0){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        public void addAt(int idx,int n){
            if (idx<0||idx>size){
                System.out.println("invalid arguments");
            }else if(idx==0){
                addFirst(n);
            }else if (idx==size){
                addlast(n);
            }else{
                Node node = new Node();
                node.data=n;
                Node temp =head;
                for (int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                size++;
            }
        }

        private Node getNode(int idx){
            Node temp=head;
            for (int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;
        }
        public void reverseDataItr(){
        int l=0;
        int r = size-1;
        while(l<r){
            Node templ =getNode(l);
            Node tempr =getNode(r);

            //swap
            int val = templ.data;
            templ.data= tempr.data;
            tempr.data=val;
            l++;
            r--;
        }
        }
        public void reversePtr(){
            Node curr = head;
            Node prev = null;
            for (int i=0;i<size;i++){
                Node nxt = curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
            }
            Node t = head;
            head = tail;
            tail = t;
        }

        //stack
        int size(){
            return size;
        }
        void push(int val){
            addFirst(val);
        }
        int pop(){
           if (size==0){
               System.out.println("empty list");
               return -1;
           }else if (size==1){
               Node temp = head;
               head=tail=null;
               size=0;
               return temp.data;
           }else {
               Node temp = head;
               head=head.next;
               size--;
               return temp.data;
           }
        }
        int top(){
            return head.data;
        }

        //queue
        void add(int n){
            //in tail part
            Node node = new Node();
            node.data=n;
            if (size==0){
                head=tail=node;
            }else{
                tail.next=node;
                tail=node;
            }size++;
        }
        int remove(){
            //from head
            if (size==0){
                System.out.println("empty list");
                return -1;
            }else if(size==1){
                Node temp=head;
                tail=head=null;
                size=0;
                return temp.data;
            }else{
                Node temp=head;
                head=head.next;
                size--;
                return temp.data;
            }
        }
        int peek(){
            return head.data;
        }

        //kth element from last
        int lastElementAt(int idx){
            Node slow =head;
            Node fast = head;
            for (int i=0;i<idx;i++){
                fast=fast.next;
            }
            while(fast!=tail){
                fast=fast.next;
                slow= slow.next;
            }
            return slow.data;
        }

        //middle
        int middle(){
            Node s=head;
            Node f=head;
            while(f!=tail&&f.next.next!=null){
                f=f.next.next;
                s=s.next;
            }
            return s.data;
        }
        

    }
    
    public static LinkedList mergeTwoLinkedList(LinkedList l1,LinkedList l2){
        Node i=l1.head;
        Node j=l2.head;
        LinkedList l3 = new LinkedList();
        Node k=l3.head;

        while(i!=null&&j!=null){
            if (i.data>j.data){
                l3.addlast(j.data);
                j=j.next;
            }else {
                l3.addlast(i.data);
                i=i.next;

            }
        }
        while(j!=null){
            l3.addlast(j.data);
            j=j.next;

        }
        while(i!=null){
            l3.addlast(i.data);
            i=i.next;

        }

        return l3;
    }

    public static LinkedList mergeSort(LinkedList l1,int l,int h){

        if (l==h){
            LinkedList l4 = new LinkedList();
            int val = l1.getAt(l);
            l4.addlast(val);
            return l4;
        }

       int mid = (l+h)/2;
        LinkedList l2 = mergeSort(l1,l,mid);
        LinkedList l3 = mergeSort(l1,mid+1,h);
        LinkedList ans = mergeTwoLinkedList(l2,l3);
        return ans;

    }

   public static LinkedList removeDuplicates(LinkedList l){
       LinkedList ans=new LinkedList();
       Node temp = l.head;
       ans.addlast(temp.data);
       temp=temp.next;
       while(temp!=null){
           if (temp.data!=ans.tail.data){
               ans.addlast(temp.data);
           }
           temp=temp.next;
       }


        return ans;
   }

   public static LinkedList oddeven(LinkedList l){
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();
        while(l.size>0){
            int val = l.getFirst();
            l.removeFirst();
            if (val%2==0){
                even.addlast(val);
            }else{
                odd.addlast(val);
            }

        }
       even.tail.next= odd.head;
       even.tail= odd.tail;
       even.size+=odd.size;
       return even;
   }

   public static void displayreverseRecurssive(Node node){
        if (node==null){
            return;
        }
        displayreverseRecurssive(node.next);
       System.out.print(node.data+",");
   }

   public static Node reverseRecussive(LinkedList l, Node node){
        if (node.next==null){
            return node;
        }

        Node t = reverseRecussive(l,node.next);
        t.next=node;
        node.next=null;
        t=l.head;
        l.head= l.tail;
        l.tail=t;
        return node;
   }

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
//        list.addlast(10);
//        list.addlast(20);
//        list.addlast(30);
//        list.addFirst(5);
//        list.display();
//        System.out.println(list.getSize());
//        System.out.println(list.getAt(3));
//        list.reverseDataItr();
//        list.display();
//        System.out.println();
//        list.addAt(1,7);
//        list.removeLast();
//        list.removeAt(1);
//        list.display();
//        list.reversePtr();
//        System.out.println();
//        list.display();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//        list.display();
//        System.out.println();
//        list.remove();
//        System.out.println(list.peek());
//        System.out.println(list.middle());
        LinkedList list1 = new LinkedList();

        list1.addlast(23);
        list1.addlast(10);
        list1.addlast(221);
        list1.addlast(22);

//        list1.addlast(56);
//        list1.display();
//        System.out.println();
//        LinkedList l3 = mergeSort(list1,0,3);
//        l3.display();
//        LinkedList l6= removeDuplicates(list1);
//         l6.display();
//        System.out.println();
        LinkedList l9=oddeven(list1);
        l9.display();
        System.out.println();
        displayreverseRecurssive(l9.head);


    }

}
