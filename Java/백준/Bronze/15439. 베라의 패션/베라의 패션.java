import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n - 1);

        if(n == 1) {
            System.out.println("0");
        }
        else
            System.out.println(sum);
    }
}

// n이 주어지면 상의 하의가 서로 다른 색상인 조합의 가짓수를 출력한다.
// 예를 들어 n = 2일때
// 상의 2번 하의 2벌 이니까 2세트가 맞춰진다.
// n = 5이면 한벌의 기준에 4개의 하의를 가진다. 왜냐하면 1번째 상의와 1번째 하의의 색깔은 다르기 때문이다.
