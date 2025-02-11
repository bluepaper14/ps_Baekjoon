import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //각 종류마다 만들어진 치킨의 수

        int a = sc.nextInt(); //a치킨
        int b = sc.nextInt(); //b치킨
        int c = sc.nextInt(); //c치킨

        int sum = 0;

        if(a > n) {
            sum += n;
        }
        else {
            sum += a;
        }

        if(b > n) {
            sum += n;
        }
        else {
            sum += b;
        }

        if(c > n) {
            sum += n;
        }
        else {
            sum += c;
        }

        System.out.println(sum);






    }
}
