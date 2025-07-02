package com.basic.arrays;

public class FindDuplicates {
    public static void main(String[] args) {
       int arr [] = {-1,0,3,4,4,28,34,45,624,786,8999};
       int n = arr.length-1;
       boolean isDuplicate = false;
       outer:
       for(int i = 0; i<=n; i++){
           for(int j = i+1; j<=n; j++){
               if(arr[i]==arr[j]){
                   isDuplicate = true;
                   break outer;
               }
           }
       }
        if(isDuplicate){
            System.out.println("The array has duplicate values");
        }
        else{
            System.out.println("The array has no duplicate values");
        }
    }
}