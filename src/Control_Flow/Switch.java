package Control_Flow;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("Sweet red fruit");



//        switch(fruit){
//            case "mango":
//                System.out.println("King of fruits");
//                break;
//            case "apple":
//                System.out.println("Sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Enter valid fruit");

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("Enter valid fruit");
        }
    }
}

/*
if break isn't provided, then all the cases below the real execution line will be printed as well
*/