import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();

            // 초 단위로 변환
            int Second = (h * 3600) + (m * 60) + s;
            int Second1 = (h1 * 3600) + (m1 * 60) + s1;

            int answer = Second1 - Second;

            // 시간, 분, 초 계산
            int h3 = answer / 3600;
            int m3 = (answer % 3600) / 60;
            int s3 = answer % 60;

            System.out.println(h3 + " " + m3 + " " + s3);
        }
    }
}
