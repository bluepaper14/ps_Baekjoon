import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minB = Integer.MAX_VALUE; // 빵이 도착하는 가장 빠른 시간 (B)
        boolean found = false; // KOI 빵을 살 수 있는 가게 여부 확인

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 현재 위치에서 가게까지 이동하는 시간
            int b = sc.nextInt(); // 빵이 도착하는 시간

            if (a <= b) { // 도착 가능할 때만 고려
                if (b < minB) { // 최소 B 값 갱신
                    minB = b;
                }
                found = true;
            }
        }

        // KOI 빵을 살 수 있는 가게가 없으면 -1 출력
        if (found) {
            System.out.println(minB);
        } else {
            System.out.println("-1");
        }
    }
}
