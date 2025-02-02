import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = n / 5;
        int sum1 = n % 5;

        for(int i = 1; i <= sum; i++) {
            System.out.print("V");
        }
        for(int i = 1; i <= sum1; i++) {
            System.out.print("I");
        }
    }
}
