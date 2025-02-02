import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String input = in.next();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if(input.charAt(i) == 'a' || 'e' == input.charAt(i) || 'i' == input.charAt(i) || 'o' == input.charAt(i) || 'u' == input.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}