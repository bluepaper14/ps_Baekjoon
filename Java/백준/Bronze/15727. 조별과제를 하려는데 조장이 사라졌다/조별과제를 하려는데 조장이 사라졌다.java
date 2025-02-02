import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //각 거리를 입력할때, 1 ~ 5칸 이동가능함. 그렇다면 5부터 해당 거리를 나눌때 나머지가 0이면 출력

        int n = scanner.nextInt();

        int sum = n / 5;

        if(n % 5 == 0) {
            System.out.println(sum);
        }
        else {
            System.out.println(sum + 1);
        }

    }
}
//1분에 1 ~ 5 거리를 이동가능하다.
//거리는 12로 입력받아 주어짐
//그렇다면 최대 거리로 계산할때 5 5 2 이렇게 3번만에 갈 수 있다.