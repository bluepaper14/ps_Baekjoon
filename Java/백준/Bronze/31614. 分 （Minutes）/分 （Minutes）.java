import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int sum = h * 60;

        int x = sum + m;
        
        System.out.println(x);
    }
}