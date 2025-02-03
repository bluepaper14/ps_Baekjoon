import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();  // 취침 시간
        int E = in.nextInt();  // 기상 시간

        int sleepTime;
        if (S <= E) {
            sleepTime = E - S;
        } else {
            sleepTime = (24 - S) + E;
        }

        System.out.println(sleepTime);
    }
}
