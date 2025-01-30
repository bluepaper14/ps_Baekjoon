import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b - c;
        String A = String.valueOf(a); //정수 -> 문자열
        String B = String.valueOf(b);

        String sum1 = A + B;

        Integer sum2 = Integer.valueOf(sum1); // 문자열 -> 정수

        int answer = sum2 - c;
        System.out.println(sum);
        System.out.println(answer);


    }
}
