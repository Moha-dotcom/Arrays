package com.company;

import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int [] arr = new int []{4, 200, 16, 1,19, 0, 12, 6};

        int size = arr.length;


        Quicksort(arr, 0,size - 1 );
        printArray(arr, size  );



    }




    public static int[] partition(int[] arr, int low, int high){



        int  pivot = arr[low];
        int i = low; // 0
        int j = high + 1  ;

        while( i < j){

            do{
                i++;

            }while (arr[i] <= pivot);


            do{
                j--;
            }while (arr[j] > pivot);

            if(i < j){
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;


        return new int[] {j, i};



    }



    public static void  Quicksort(int arr[] , int low, int high){

        if(low < high){

            int [] less = partition(arr, low, high);


            Quicksort(arr, low  , less[0]);
            Quicksort(arr, less[1], high - 1 );

        }
    }


    public static void printArray(int arr[] , int size){

        for(int i = 0 ; i< size; i++){
                System.out.print(arr[i] + " ");
        System.out.println("");
        }
    }



}