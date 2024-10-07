package Basics;
import java.util.Scanner; //Shortcut: Scanner

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //System.in means the input is taken from the keyboard

        //System.out.println(input.nextLine());

        System.out.print("Please enter your rollno:");
        int rollno = input.nextInt();
        System.out.println("Your rollno is: " + rollno);


        // int a = 10; (a is identifier and 10 is literal)
        //we do not specify commas between large number so we use underscore: 23_500_00

        //To input a string:

        input.nextLine(); //this is required to consume the newline created after inputting integer
        String name = input.nextLine(); //the input.nextLine() immediately reads the leftover newline (\n) instead of waiting for the name input.
        System.out.println(name); //to avoid the above problem, input.nextLine() is added or else we can modify this line to print();

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}


/*
nextFloat() doesn’t have issues because it’s designed to ignore any whitespace (including the newline)
when reading numbers. nextLine(), on the other hand, will read up to the first newline character, so if
there's a leftover newline from a previous nextInt(), it will pick that up, and the result is an empty string.
*/
