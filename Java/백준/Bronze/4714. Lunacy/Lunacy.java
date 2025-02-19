import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x = scanner.nextDouble();
            if (x < 0) break; // 음수 입력 시 종료

            double moonWeight = x * 0.167;

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", x, moonWeight);
        }
    }
}
