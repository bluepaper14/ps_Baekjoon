import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isRising = true;
        boolean isDiving = true;
        boolean isConstant = true;

        for (int i = 0; i < 3; i++) {
            if (arr[i] >= arr[i + 1]) {
                isRising = false;
            }
            if (arr[i] <= arr[i + 1]) {
                isDiving = false;
            }
            if (arr[i] != arr[i + 1]) {
                isConstant = false;
            }
        }

        if (isRising) {
            System.out.println("Fish Rising");
        } else if (isDiving) {
            System.out.println("Fish Diving");
        } else if (isConstant) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }

        scanner.close();
    }
}
