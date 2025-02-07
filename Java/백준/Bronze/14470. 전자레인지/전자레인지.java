import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //현재 고기의 온도
        int b = sc.nextInt(); //목표 고기의 온도
        int c = sc.nextInt(); //얼은 고기를 1도 높이는데 걸리는 시간
        int d = sc.nextInt(); //0도에서 해동하는데 걸리는 시간
        int e = sc.nextInt(); //얼지 않은 고기를 1도 높이는데 걸리는 시간

        //일단 시간을 더하기 위해선 0도를 기준으로 얼지 않고 걸리는 시간과 얼었을때 걸리는 시간을 합쳐야함
        int minus = 0;
        int plus = 0;
        if(a < 0) {
            minus = Math.abs(a) * c;
            plus = b * e;
            int sum = minus + plus + d;
            System.out.println(sum);
        }
        else { //만약 a가 양수라면 b - a로 걸리는 총 시간을 먼저 확인
            plus = (b - a) * e;
            System.out.println(plus);
        }
        //여기서 b가 음수인 조건이 없기 때문에, b가 양수임을 전제하에 계산
    }

}
