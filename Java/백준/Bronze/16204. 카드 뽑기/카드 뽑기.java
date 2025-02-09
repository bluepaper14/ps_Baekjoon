import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //총 카드의 개수
        int m = sc.nextInt(); //앞의 M개의 개수
        int k = sc.nextInt(); //뒤 O개의 개수

        // OO or XX 인 카드의 최대 개수

        // OO인 경우
        int sum = min(m, k); //앞면이 O
        int sum2 = min(n - m, n - k); //뒷면 0

        System.out.println(sum + sum2);



    }
}


