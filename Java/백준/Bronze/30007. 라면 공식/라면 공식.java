import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();

            int answer = a * (x - 1) + b;
            System.out.println(answer);
        }

    }
}
