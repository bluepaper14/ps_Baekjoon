import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {  // 줄이 있을 때 계속 입력받음
            String s = sc.nextLine();

            if (s.equals("END")) {  // "END" 입력 시 종료
                break;
            }

            // 문자열 거꾸로 출력
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println(); // 줄바꿈
        }

        sc.close();
    }
}
