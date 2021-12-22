package LinkedList;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {





        int [] arr = {1,2,3,4,5,6,7};

        System.out.println("Reversed = " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Reversed = " + Arrays.toString(arr));




    }

    private static void reverse(int []arr){

        int i = 0;
        int j = arr.length-1;





        while (i < j){
            System.out.println("Reverse "  + arr[i]  + " With "  + arr[j]);

            int temp  = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;



            i++;
            j--;




        }







    }


}


