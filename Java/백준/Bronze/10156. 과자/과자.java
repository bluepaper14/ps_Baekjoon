import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 제품 가격
        int n = sc.nextInt(); // 개수
        int m = sc.nextInt(); // 수중에 있는돈
        if((k * n) < m) {
            System.out.println("0");
        }
        else {
            System.out.println((k * n) - m); 
        }
    }
}