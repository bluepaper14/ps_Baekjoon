import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = n / 2;
        int y = m / 2;

        if(x >= y) {
            System.out.println(y);
        }
        else {
            System.out.println(x);
        }
    }
}


