package com.basic.numbers;

public class GcdLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        int lcm = a*b/gcd(a,b);
        return lcm;
    }
}
