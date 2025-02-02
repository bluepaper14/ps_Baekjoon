import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();  // 개행 문자 제거 (nextInt() 후에는 nextLine()이 필요할 수 있음)

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // BigInteger를 사용하여 큰 수 연산 수행
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        BigInteger product = bigA.multiply(bigB);

        // 결과 출력
        System.out.println(product);

        scanner.close();
    }
}
