import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print(i);
            System.out.print(" ");
            if(i % 6 == 0) {
                System.out.print("Go! ");
            }
        }
        if(n % 6 != 0) {
            System.out.print("Go!");
        }

    }
}
