import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        
        int x1 = s1 * 3;
        int x2 = s2 * 20;
        int x3 = s3 * 120;
        
        int n1 = m1 * 3;
        int n2 = m2 * 20;
        int n3 = m3 * 120;

        int maxy = x1 + x2 + x3;

        int mel = n1 + n2 + n3;

        if(maxy > mel) {
            System.out.println("Max");
        }
        else if(maxy == mel) {
            System.out.println("Draw");
        }
        else {
            System.out.println("Mel");
        }
    }
}

