package ArraysAndStrings;

public class ArrayBasics {
    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name = new datatype[size];

        //store 5 roll numbers:
        int[] rnos1 = new int[5];

        //or directly:
        int[] rnos2 = {23,24,25,26,27};

        //int[] ros; (declaration of array, ros is getting defined in the stack
        //ros = new int[5]; //actual allocation of memory occurs in this initialization

        String[] arr = new String[4];
        System.out.println(arr[0]);

        /*
        null is a special literal or a special value that can only be assigned to any reference type but not
        primitive data types

        primitive data types are stored in stack memory only

        The reference variable are stored in the stack memory, and the objects are stored in the heap memory.
        The stack will point to heap.
        */




    }




}
