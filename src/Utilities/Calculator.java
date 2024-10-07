package Utilities;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        while(true){
            //take the operator as input
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            int a;
            int b;

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the two numbers");
                a = in.nextInt();
                b = in.nextInt();
                if (op == '+'){
                    System.out.println(a+b);
                }
                if (op == '-'){
                    System.out.println(a-b);
            }
                if (op == '*'){
                    System.out.println(a*b);
            }
                if (op == '/'){
                    if(b==0){
                        System.out.println("Cannot divide by zero");
                    }
                    else{
                        System.out.println(a / b);
                    }

            }
                if (op == '%'){
                    System.out.println(a%b);
            }
            }
            else if(op == 'x' || op =='X'){
                System.out.println("Exiting....");
                break;
            }

            else{
                System.out.println("Ivalid operation");
            }
        }
    }
}
