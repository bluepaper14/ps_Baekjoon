import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int sum = n + m + k;

        if(sum >= 100) {
            System.out.println("OK");
        }
        else {
            int x = Math.min(n, Math.min(m, k));
            if(x == n) {
                System.out.println("Soongsil");
            }
            if(x == m) {
                System.out.println("Korea");
            }
            if(x == k) {
                System.out.println("Hanyang");
            }
        }

    }
}
