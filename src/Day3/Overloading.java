package Day3;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Vivek");
    }


    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

/*
Same function name but different type of parameters is allowed, this is called function overloading

In this case, that function will run which has the same type of parameter and same number of parameters as in the function call.
 */