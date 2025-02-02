import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        int sum = n * 10;
        int x = m + sum;

        System.out.println(x);
    }
}
