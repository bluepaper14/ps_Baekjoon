import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt(); // 직사각형 c 가로의 길이
        double b = sc.nextInt(); // a의 반지름

        double x = (2 * b) * 3.141592;
        double y = 2 * a;

        double sum = x + y;

        System.out.println(sum);

    }
}
