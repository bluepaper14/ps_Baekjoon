import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 3 == 0) {
            System.out.println("S");
        }
        if(n % 3 == 1) {
            System.out.println("U");
        }
        if(n % 3 == 2) {
            System.out.println("O");
        }
    }
}

