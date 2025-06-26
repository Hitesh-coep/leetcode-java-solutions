package com.basic.numbers;

public class Palindrome {
public static void main(String[] args) {
        int num = 123456;
        int originalNum = num;
        int newNum = 0;
        while (num>0){
            int rem = num%10;
            newNum = (newNum*10)+(rem);
            num = num/10;
        }
        if(originalNum == newNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}