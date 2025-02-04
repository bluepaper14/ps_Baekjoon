import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();

        if(m % n == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}