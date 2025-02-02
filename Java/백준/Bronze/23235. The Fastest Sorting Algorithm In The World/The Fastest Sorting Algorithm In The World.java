import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;

        while (in.hasNextLine()) {
            String input = in.nextLine();

            if(input.equals("0")) {
                break;
            }
            i++;
        }

        for (int j = 1; j <= i; j++) {
            System.out.println("Case " + j + ": Sorting... done!");
        }
    }
}