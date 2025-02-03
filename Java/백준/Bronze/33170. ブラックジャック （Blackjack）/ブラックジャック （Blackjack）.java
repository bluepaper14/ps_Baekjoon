import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int sum = n + m + k;

        if(sum <= 21) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
