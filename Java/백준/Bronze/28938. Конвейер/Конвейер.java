import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();


        int sum = 0;
        for (int i = 0; i < h; i++) {
            sum = sum + sc.nextInt();
        }
        if (sum > 0) {
            System.out.println("Right");
        }
        else if(sum == 0) {
            System.out.println("Stay");
        }
        else {
            System.out.println("Left");
        }

    }
}

