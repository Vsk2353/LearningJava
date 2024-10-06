package Day3;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // a is initialized already so we can only change it under this function "psvm"
        int b = 20;

        //System.out.println(num); (cannot use num here)
        {
            // int a = 20; (error: can initialize only once under a given function)
            a = 20; //but we can  change it
            int c =20; //values initialized in the block remain in the block only
        }


    }

    static void random(){
        int num = 67;
        //System.out.println(a); (cannot use a here)
    }
}
