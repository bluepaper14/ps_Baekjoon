import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {  // 입력이 있는 동안 계속 읽음
            String line = sc.nextLine();
            System.out.println(line); // 그대로 출력
        }

        sc.close();
    }
}
