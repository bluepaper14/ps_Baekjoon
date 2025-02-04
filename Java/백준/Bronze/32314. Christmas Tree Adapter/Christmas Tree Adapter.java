import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sc.nextInt() / sc.nextInt();

        if(n <= x) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}

