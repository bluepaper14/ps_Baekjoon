import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int sum = (a + b) / 2;
        int diff = (a - b) / 2;

        int sum1 = (a + b) % 2;
        int diff1 = (a - b) % 2;

        if(sum1 != 0 || diff1 != 0) {
            System.out.println("-1");
        }
        else if(sum < 0 || diff < 0) {
            System.out.println("-1");
        }

        else if(sum > diff) {
            System.out.print(sum);
            System.out.print(" ");
            System.out.print(diff);
        }
        else {
            System.out.print(diff);
            System.out.print(" ");
            System.out.print(sum);
        }

    }
}
