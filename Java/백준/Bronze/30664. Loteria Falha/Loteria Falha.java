import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 입력을 받는 부분, 큰 숫자도 처리할 수 있도록 BigInteger 사용
            BigInteger n = sc.nextBigInteger();

            // 종료 조건: n이 0이면 종료
            if (n.equals(BigInteger.ZERO)) {
                break;
            }

            // 42의 배수인지 확인
            if (n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }

        sc.close();
    }
}
