import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double x = (b - a) / 400;

        double y = Math.pow(10, x);

        double result = 1 / (1 + y);

        System.out.println(result);


    }
}
