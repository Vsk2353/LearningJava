package Control_Flow;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0); //trim() removes the extra spaces in front and behind the word

        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
