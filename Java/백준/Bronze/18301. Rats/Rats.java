import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int num = (n + 1) * (n1 + 1);

        int num2 = num / (n2 + 1);

        int answer = num2 - 1;

        System.out.println(answer);


    }
}
