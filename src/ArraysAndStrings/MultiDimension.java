package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*

            1 2 3
            4 5 6
            7 8 9

         */

        // int[][] arr = new int[3][]; (rows and then columns, also adding rows is mandatory)

        Scanner in = new Scanner(System.in);
        //direct method


        int[][] arr2D = {
                {1,2,3}, //0th index
                {4,5}, //1st index
                {7,8,9,10} //2nd index
        };

        //we can imagine it as array of arrays in the memory

        //Taking 2D array input

        int [][] arr = new int[3][3];
        // System.out.println(arr.length); // no of rows is returned

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            
        }

        // first method of outputting the array
        System.out.println("First method to output: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }

        System.out.println("Second method to output: ");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        System.out.println("Third method to output:");
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
