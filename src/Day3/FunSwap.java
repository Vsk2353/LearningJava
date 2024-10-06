package Day3;

import java.util.Scanner;

public class FunSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = 10;
//        int b = 20;

//        swap(a,b);
//        System.out.println(a+" "+b);

        String name = "Vivek Kulkarni";
        swapName(name);
        System.out.println(name);
    }


//    static void swap(int a,int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }


    static void swapName(String name){
        name="Kulkarni";

    }
}
/*
So even if the function swaps the variables, the swapping doesn't occur in the output
So when we pass values to the function, it doesn't change it in the outer scope

Always, when we paas variable to the function, a copy of the ref variable is passed
In Java there is no pass by reference, there is only pass by value
 */