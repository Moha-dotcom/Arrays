package com.company;

import java.util.Arrays;

public class Challenge {

    public static void main(String[] args) {


        int arr [ ] = new int[]{9,1,8,5,10,200,6, 567};
        int size = arr.length;

        intercharge(arr, 0, size - 1);
        printArray(arr, size );



    }


    public static void  printArray(int arr[] , int size){
        for (int i = 0 ;  i< arr.length; i++){
            System.out.println(arr[i] + " ");

            System.out.println(" ");
        }
    }


    public static  int [] intercharge(int arr[], int low, int high){
        int i = low;
        int j = high;


        int newArr [] = Arrays.copyOf(arr, arr.length);



        while(i < j){


            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;

            i++;
            j--;



        }



        return newArr;



    }




}
