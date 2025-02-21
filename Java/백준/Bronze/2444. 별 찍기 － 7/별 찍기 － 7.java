import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // 윗부분 (다이아몬드의 상단)
        for (int i = 1; i <= n * 2 - 1; i += 2) {
            for (int x = 0; x < (n - i / 2 - 1); x++) { // 공백 조정
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 (다이아몬드의 하단)
        for (int i = n * 2 - 3; i > 0; i -= 2) {
            for (int x = 0; x < (n - i / 2 - 1); x++) { // 공백 조정
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
