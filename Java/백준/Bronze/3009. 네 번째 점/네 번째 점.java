import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        
        // XOR 연산을 이용해 유일한 좌표 찾기
        int x4 = x1 ^ x2 ^ x3;
        int y4 = y1 ^ y2 ^ y3;
        
        System.out.println(x4 + " " + y4);
        
        sc.close();
    }
}
