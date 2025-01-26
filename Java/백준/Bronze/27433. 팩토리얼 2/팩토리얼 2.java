import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 1;
        for(int i = 0; i < n; i++) {
            sum = sum * (i + 1);
        }
        System.out.println(sum);
    }
}
//n을 입력해 팩토리얼을 구하는 문제
// 1 * (1 + 1) * (1 + 2) .....n만큼 반복시키면된다.
// for문을 사용해서 i를 증가시켜 만들자.

//n이 5일때
//1 x 2 x 3 x 4 x 5