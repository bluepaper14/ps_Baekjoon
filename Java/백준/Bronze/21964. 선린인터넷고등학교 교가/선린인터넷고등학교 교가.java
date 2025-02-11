import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();

        for(int i = n - 5; i < n; i++) {
            System.out.print(x.charAt(i));
        }
    }
}
