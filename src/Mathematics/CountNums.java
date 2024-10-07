package Mathematics;

public class CountNums {
    public static void main(String[] args) {
        int n = 4553565;
        int count =0;

        while(n>0){

            if (n%10==5){
                count+=1;
            }
            n=n/10;
        }

        System.out.println(count);
    }
}
