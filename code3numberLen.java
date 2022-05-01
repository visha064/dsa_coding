package com.company.coding;

public class code3numberLen {

    public static int numberLen(int x){
        int count=0;

        while(x>0){
            x/=10;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberLen(-34));
    }
}
