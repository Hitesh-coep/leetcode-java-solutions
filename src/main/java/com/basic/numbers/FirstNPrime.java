package com.basic.numbers;

public class FirstNPrime {
    public static void main(String[] args) {
        int n = 10;
        int prime = 2;
        int i = 0;
        while(i<n){
            boolean isprime= true;
            for (int j = 2; j<=Math.sqrt(prime);j++){
                if(prime%j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(prime);
                i++;
            }
            prime++;
        }
    }
}