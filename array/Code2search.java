package com.company.coding.array;
import java.util.Scanner;
public class Code2search {
    public static void main(String[] args) {
        int s = -1;
        int n = 4;
        int [] arr = {1,52,3,64,5};
        for (int i = 0 ; i <arr.length; i++){
            if (arr[i]==n){
                s=i;
                break;
            }
        }
        System.out.println(s);
    }
}
