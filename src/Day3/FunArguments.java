package Day3;

import java.util.Scanner;

public class FunArguments {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int ans = sum(10,20);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return(a+b);
    }
}
