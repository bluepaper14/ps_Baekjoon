import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        if(h == 2) {
            System.out.println("1");
        }
        else if((h - 2) % 7 == 0 ) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}

