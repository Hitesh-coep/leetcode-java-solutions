package com.basic.arrays;

public class IfArraySorted {
    public static void main(String[] args) {
       int arr [] = {-1,0,3,4,9,28,34,45,624,786,8999};
       int n = arr.length-1;
       boolean nonDecreasing = true;
       boolean nonIncreasing = true;
       for(int i = 0; i<n; i++){
           if(arr[i]>arr[i+1]){
               nonDecreasing = false;
           }
           if(arr[i]<arr[i+1]){
               nonIncreasing = false;
           }
       }
        if (nonDecreasing) {
            System.out.println("Sorted in non-decreasing (ascending) order");
        } else if (nonIncreasing) {
            System.out.println("Sorted in non-increasing (descending) order");
        } else {
            System.out.println("Not Sorted");
        }
    }
}