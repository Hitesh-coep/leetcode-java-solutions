package com.basic.arrays;

public class BinarySearch {
    public static void main(String[] args) {
       int arr [] = {-1,0,3,4,9,21,34,45,624,786,8999};
       boolean found = false;
       int num = 623;
       int n = arr.length;
       int hi = n-1;
       int lo = 0;
       while(lo<=hi){
           int mid = lo+(hi-lo)/2;
           if(num>arr[mid]){
               lo = mid+1;
           }
           else if(num<arr[mid]){
               hi = mid -1;
           }
           else{
               System.out.println("Element found at "+ mid);
               found = true;
               break;
           }
       }
       if(!found){
           System.out.println("Element not Found");
       }
    }
}