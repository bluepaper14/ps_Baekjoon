import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = Math.min(Math.min(a,b), Math.min(c, d)); //4등
        int max = Math.max(Math.max(a,b), Math.max(c, d)); //1등

        int sum = a + b + c + d;
        int y = min + max;
        int x = sum - y; //2등 + 3등

        //내가 구하고 싶은 것은 (2 + 3) 과 (1 + 4)의 차이

        int answer = Math.abs(x - y);

        System.out.println(answer);




    }
}
