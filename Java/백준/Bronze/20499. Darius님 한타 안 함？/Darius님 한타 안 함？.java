import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("/|\n");  // '/' 또는 개행('\n')을 구분자로 사용

        int k = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();

        if(k + a < d) {
            System.out.println("hasu");
        }
        else if(d == 0) {
            System.out.println("hasu");
        }
        else {
            System.out.println("gosu");
        }
    }
}
