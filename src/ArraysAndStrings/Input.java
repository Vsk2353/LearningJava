package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ARRAY OF PRIMITIVES

        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 62;
//        arr[2] = 52;
//        arr[3] = 12;
//        arr[4] = 22;
//        System.out.println(arr[3]);
        
        //input using loops
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        /*
        for each loop
        for every element in the array, print element ( enhanced loop )
        */
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println(" ");
        //tostring method
        System.out.println("To string method");
        System.out.println(Arrays.toString(arr));

        // ARRAY OF OBJECTS

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.print(Arrays.toString(str));


    }
}

/*

In the example of String[], the array doesn't directly hold the strings but the
references to where the String objects are stored in memory.
In contrast, an array of primitives, like int[], holds the actual primitive data.

 */