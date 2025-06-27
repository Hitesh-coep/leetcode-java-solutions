package com.basic.numbers;

public class AllDivisors {
    public static void main(String[] args) {
        int num = 49;
        for (int i = 1; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                System.out.println(i);

                if(i != num/i) {
                    System.out.println(num/i);
                }
            }
        }
    }
}