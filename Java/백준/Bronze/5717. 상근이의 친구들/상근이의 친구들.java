import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = n + m;
            if( n == 0 && m == 0 ) break;

            System.out.println(sum);
        }
    }
}


