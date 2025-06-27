package com.basic.numbers;

public class Factorial {
 public static void main(String[] args) {
        int number = 1;
        System.out.println(fact(number));
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}