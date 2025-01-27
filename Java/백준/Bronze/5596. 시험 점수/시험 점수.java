import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int sum1 = a + b + c + d;
        int sum2 = q + r + s + t;

        if (sum1 > sum2) {
            System.out.println(sum1);
        }
        else
            System.out.println(sum2);

    }
}


