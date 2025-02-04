import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            if(number % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        if(even > odd) {
            System.out.println("Happy");
        }
        else {
            System.out.println("Sad");
        }
    }
}


//짝수의 개수가 홀수보다 많으면 기뻐하고(Happy), 그렇지 않으면 슬퍼한다(Sad).