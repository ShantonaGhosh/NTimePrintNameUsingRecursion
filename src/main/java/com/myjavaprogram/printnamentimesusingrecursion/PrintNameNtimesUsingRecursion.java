package com.myjavaprogram.printnamentimesusingrecursion;

public class PrintNameNtimesUsingRecursion {

    public static void printName(int i, int n) {
        if(i<1){
            return;
        }
        System.out.println(i);
        printName(i-1, n);
    }

    public static void main(String[] args) {
        int n = 5;
     
        printName(n,n);
       
      
    }
}
