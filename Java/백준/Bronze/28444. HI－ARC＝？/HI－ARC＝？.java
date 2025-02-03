import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int i = in.nextInt();
        int a = in.nextInt();
        int r = in.nextInt();
        int c = in.nextInt();


        int sum = h * i;
        int sum1 = a * r * c;
        
        int x = sum - sum1;
        
        System.out.println(x);
    }
}
