package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        //Array list is nothing but vector in c++

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        list.add(67);
        list.add(50);
        list.add(90);
        list.add(78);

        System.out.println(list.contains(67));
        list.set(0,99);
        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(i, in.nextInt());
        }
        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] will not work here
        }
    }
}
