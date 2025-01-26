import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); //새로축
        int c = sc.nextInt(); //가로축

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
