package Questions;
//Input a year and find whether it is a leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%4==0 && year%100!=0|| year%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}

/*
HCF(a,b)=HCF(b,a%b)

public static int hcf(int a, int b) {
    while (b != 0) {         // Repeat until remainder becomes 0
        int temp = b;        // Temporarily store b
        b = a % b;           // Replace b with remainder of a divided by b
        a = temp;            // Replace a with the previous value of b
    }
    return a;                // When b becomes 0, a is the HCF
}


 */
