package com.basic.numbers;

public class Armstrong {
public static void main(String[] args) {
        int num = 9474;
        int originalNum = num;
        int convertedNum=0;
        int count = countDigits(num);
        while(num>0){
            int rem = num%10;
            convertedNum+=Math.pow(rem,count);
            num/=10;
        }
        if(originalNum ==convertedNum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
    public static int countDigits(int n) {
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}