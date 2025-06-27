package com.basic.numbers;

public class Prime {
    public static void main(String[] args) {
        int a = 97;
        int flag = 0;
        if (a <= 1){
            System.out.println("Neither prime nor composite");
            return;
        }
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0) {
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Composite Number");
        }
    }
}