import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long R = sc.nextLong(); // 세로 크기
        long C = sc.nextLong(); // 가로 크기
        long N = sc.nextLong(); // CCTV 수용 범위

        // CCTV 개수 계산 (올림 처리)
        long rowCount = (R + N - 1) / N;  // 세로 방향 CCTV 개수
        long colCount = (C + N - 1) / N;  // 가로 방향 CCTV 개수
        long result = rowCount * colCount;

        System.out.println(result);
    }
}
