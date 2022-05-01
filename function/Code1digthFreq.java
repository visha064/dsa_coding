package com.company.coding.function;

public class Code1digthFreq {

    static int digitFreq(int n , int d){
        int count=0;
        while(n>0){
            if(n%10==d){
                count++;
            }
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = digitFreq(98979,9);
        System.out.println(ans);

    }
}
