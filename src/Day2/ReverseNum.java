package Day2;
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Program to reverse a given number");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int out=0;
        while(n>0){
            out = out*10 + n%10;

            n=n/10;
        }
        System.out.println(out);
    }
}
