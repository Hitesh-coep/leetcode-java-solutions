package com.basic.numbers;

public class Fibonacci {

    public static void main(String[] args) {
        int f0=0;
        int f1=1;
        System.out.println(f0);
        System.out.println(f1);
        for (int i =2;i<10;i++){
            int next = f0+f1;
            System.out.println(next);
            f0=f1;
            f1=next;
        }
    }
}

