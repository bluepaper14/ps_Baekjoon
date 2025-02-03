import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (620 <= n && n <= 780) {
            System.out.println("Red");
        }
        if (590 <= n && n < 620) {
            System.out.println("Orange");
        }
        if (570 <= n && n < 590) {
            System.out.println("Yellow");
        }
        if (495 <= n && n < 570) {
            System.out.println("Green");
        }
        if (450 <= n && n < 495) {
            System.out.println("Blue");
        }
        if (425 <= n && n < 450) {
            System.out.println("Indigo");
        }
        if (380 <= n && n < 425) {
            System.out.println("Violet");
        }
    }
}
