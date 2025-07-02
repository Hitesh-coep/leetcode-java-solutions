package com.basic.arrays;

public class FindMinMax {
    public static void main(String[] args) {
       int arr [] = {-1,0,45,67,8999,3,9,98,4,21};
       int n = arr.length;
       int MAX = Integer.MIN_VALUE;
       int MIN = Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]>=MAX){
               MAX = arr[i];
           }
           if(arr[i]<=MIN){
               MIN = arr[i];
           }
       }
        System.out.println(MAX);
        System.out.println(MIN);
    }
}