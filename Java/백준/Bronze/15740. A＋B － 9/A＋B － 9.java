import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A와 B를 입력받고 공백을 기준으로 분리
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        // A+B의 합을 출력
        System.out.println(A.add(B));

        scanner.close();
    }
}
