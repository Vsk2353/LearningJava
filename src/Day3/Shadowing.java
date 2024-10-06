package Day3;

public class Shadowing {
    static int x = 10; // this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); //10

        int x = 50; //The scope will only begin if the object is initialized
        System.out.println(x); //50
        fun();
    }
    static void fun(){
        System.out.println(x); //This uses the higher scope x
    }
}
/*
So shadowing means, an object declared in a higher scope will be hidden when the same object is
initialized again in a lower scope and we print it in this scope.
 */
