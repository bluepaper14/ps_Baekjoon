import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); //가격
        int b = in.nextInt(); //성능

        int c = in.nextInt(); //가격

        int sum = (3 * b * c) / a;

        System.out.println(sum);




    }
}