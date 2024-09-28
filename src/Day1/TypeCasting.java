package Day1;



public class TypeCasting {
    public static void main(String[] args){
        //TypeCasting:


        int num = (int)(67.56f);
        System.out.println("First output: " + num);

        //narrowing typecasting
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println("Second output: " + b);

        //Type Promotion
        byte c = 20;
        byte d = 30;
        int e = c*d;
        System.out.println("Third output: " + e);



    }
}

/*
An integer input will be converted from integer to float if we assign a floating type reference variable,
But an integer reference variable cannot do the same, as the destination size is smaller than the source.
Thats when we need to explicitly convert.


Also in an expression, each individual literals no matter what data type are converted into the largest
data type present.
*/
