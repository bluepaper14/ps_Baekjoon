import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); // 방학 일수
        int a = sc.nextInt(); // 국어 페이지 수
        int b = sc.nextInt(); // 수학 페이지 수
        int c = sc.nextInt(); // 하루 최대 국어 페이지 수
        int d = sc.nextInt(); // 하루 최대 수학 페이지 수

        // 국어와 수학 각각 며칠 걸리는지 계산
        int sum = a / c; // 국어 걸리는 일수 (소수점 아래 버림)
        if (a % c != 0) { // 나머지가 있다면 하루 더 필요
            sum += 1;
        }

        int sum1 = b / d; // 수학 걸리는 일수 (소수점 아래 버림)
        if (b % d != 0) { // 나머지가 있다면 하루 더 필요
            sum1 += 1;
        }

        // 더 오래 걸리는 과목의 일수를 기준으로 방학에서 차감
        int answer;
        if (sum >= sum1) { // 국어가 더 오래 걸리면
            answer = l - sum;
        } else { // 수학이 더 오래 걸리면
            answer = l - sum1;
        }

        System.out.println(answer); // 남은 방학 일수 출력
    }
}



//각 과목이 며칠이 걸리는지 확인하고 이를 각각 구하고 더해 최종 방학일수에 빼도록 하자
//근데 하루마다 과목을 푸는것이 아님
//25 - 6
//30 - 8 이면
//국어가 5일걸리니까 일수 빼면 15일이다.

//그러면 일단 각 일수를 구할때 몫이 큰 것으로 조정
// L : 방학 일수
// A C : 국어 풀어야 하는 페이지 + 최대로 풀수있는 페이지
// B C : 수학 풀어야 하는 페이지 + 최대로 풀수있는 페이지
