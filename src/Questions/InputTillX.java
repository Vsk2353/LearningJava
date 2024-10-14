package Questions;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class InputTillX {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input;
        int sum = 0;


        while(true){
            System.out.println("Enter your number or enter 'x' to exit");
            input = in.next();

            switch(input){
                case "x","X" ->{
                    System.out.println("Sum of all numbers: " + sum);
                    return;
                }
                default -> {
                    try{
                        sum+=Integer.parseInt(input);
                    } catch(NumberFormatException e){
                        System.out.println("Enter valid number");
                    }
                }
            }

        }

    }
}
