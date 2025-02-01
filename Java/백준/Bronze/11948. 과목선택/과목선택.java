import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //물
        int b = sc.nextInt(); //화
        int c = sc.nextInt(); //생
        int d = sc.nextInt(); //지

        int e = sc.nextInt(); //역사
        int f = sc.nextInt(); //지리

        int min = Math.min(Math.min(a, b), Math.min(c, d));
        int tmp = 0;

        if(e > f) {
            tmp = e;
        }
        else
            tmp = f;

        int sum = a + b + c + d - min + tmp;

        System.out.println(sum);
    }

}
