import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = 0;
        while (in.hasNextLine()) {
            in.nextLine();  // 한 줄을 읽고 지나칩니다.
            cnt++;  // 줄 수를 세어줍니다.
        }
        System.out.println(cnt);  // 최종적으로 줄 수를 출력합니다.
    }
}
