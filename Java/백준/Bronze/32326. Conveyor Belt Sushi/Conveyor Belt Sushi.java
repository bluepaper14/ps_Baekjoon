import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int price = sc.nextInt() * 3 + sc.nextInt() * 4 + sc.nextInt() * 5;

        System.out.println(price);
    }
}

