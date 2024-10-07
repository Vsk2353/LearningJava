package Questions;

public class PrintArmstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            int sum = 0;
            int num = i;
            while(num>0){
                int rem = num%10;
                sum = sum + rem*rem*rem;
                num=num/10;
            }
            if (sum== i){
                System.out.println(sum);
            }

            }

        }
    }

