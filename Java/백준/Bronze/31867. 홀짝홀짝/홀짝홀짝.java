import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //문자의 자릿수 입력
        sc.nextLine(); //개행문자 제거
        String s = sc.nextLine(); //수를 문자열로

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int x = s.charAt(i) - '0';

            if(x % 2 == 0) {
                cnt++; //만약 i번째 자릿수가 짝수라면 cnt 증가
            }
            else {
                sum++; //i번째가 홀수라면 sum 증가
            }
        }
        if(cnt > sum) {
            System.out.println("0");
        }
        else if(cnt == sum) {
            System.out.println("-1");
        }
        else {
            System.out.println("1");
        }


    }
}
