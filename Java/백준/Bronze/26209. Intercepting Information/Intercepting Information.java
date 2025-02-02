import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int g = in.nextInt();
        int h = in.nextInt();

        if(a == 9 || b == 9 || c == 9 || d == 9 || e == 9 || f == 9 || g == 9 || h == 9) {
            System.out.println("F");
        }
        else {
            System.out.println("S");
        }



    }
}