import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            if(n < 40) {
                n = 40;
            }
            sum += n;
        }
        int x = sum / 5;
        System.out.println(x);
    }
}
//각 학생의 40점 미만은 40점으로 환산
// 그리고 5명의 점수를 전부 더해 평균값 출력. 조건문을 활용하여 따로 빼보자
