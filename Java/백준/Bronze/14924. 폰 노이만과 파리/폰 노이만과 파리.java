import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //기차의 속도
        int t = sc.nextInt(); //파리의 속도
        int d = sc.nextInt(); //두 기차 사이의 거리

        int sum = t * (d / (2 * s));

        System.out.println(sum);



    }

}
//