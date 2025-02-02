import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int sum  = (a * 5) + (n * 5) + (m * 5) + (d * 5) + (e * 5) + (f * 5);

        System.out.println(sum);

    }
}