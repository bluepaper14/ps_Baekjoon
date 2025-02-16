import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //서울대에서 공학관까지 가는 시간
        int y = scanner.nextInt(); //공학관까지 걸리는 시간

        if(y > x) {
            System.out.println(y - x);
        }
        else {
            System.out.println(x + y);
        }

    }
}

