package Day3;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2,3,4,5,6,7,8,12);
        multiple(10,20,"Vivek");
    }

    //Variable length argument always at the end:
    static void multiple(int a,int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
/*
VarArgs: When we do not know how many variable to give to a given method
 */