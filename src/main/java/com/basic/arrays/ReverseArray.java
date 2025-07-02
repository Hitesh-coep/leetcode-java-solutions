package com.basic.arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int arr [] = {-1,0,3,4,9,21,34,45,624,786,8999};
       int first = 0;
       int last = arr.length-1;
       while(last>=first){
           int temp = arr[first];
           arr[first] = arr[last];
           arr[last] = temp;
           first++;
           last--;
       }
       for(int i =0; i<arr.length;i++){
           System.out.print(arr[i]+", ");
       }
    }
}