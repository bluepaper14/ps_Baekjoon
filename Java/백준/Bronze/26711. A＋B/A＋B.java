import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner sc = new Scanner(System.in);

        // 첫 번째 숫자 입력받기 (BigInteger로 처리)
        BigInteger a = new BigInteger(sc.nextLine());

        // 두 번째 숫자 입력받기 (BigInteger로 처리)
        BigInteger b = new BigInteger(sc.nextLine());

        // 두 숫자의 합 계산
        BigInteger result = a.add(b);

        // 결과 출력
        System.out.println(result);
    }
}
