import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt(); //잔고 A
        long b = sc.nextInt(); //잔고 B

        long c = sc.nextInt(); //치킨 가격

        long sum = a + b;
        long sum1 = a + b -  (2 * c);
        if(a + b < 2 * c) {
            System.out.println(sum);
        }
        else {
            System.out.println(sum1);
        }
    }
}
