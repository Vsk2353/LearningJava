package Functions;

import java.util.Scanner;

public class FunSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sum();
        /*
        int ans = sum();
        System.out.println(ans);
         */
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        System.out.println("The sum is: " + (num1+num2));

        /*
        We can instead return the value using: return sum
         */

        /*
        So when a value is returned from a function, the function's job is done and the pointer comes out.
         */
    }
}
