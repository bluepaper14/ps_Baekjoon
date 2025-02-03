import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;

            sum3 = sum3 + (i * i * i);
        }
        sum2 = sum * sum;


        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);


    }
}
