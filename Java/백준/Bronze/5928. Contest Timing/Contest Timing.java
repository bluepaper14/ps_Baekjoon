import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt(); //D 대회 종료 날짜(11 ~ 14)
        int H = scanner.nextInt(); //시간
        int M = scanner.nextInt(); //분
        //11 11 11
        //12 13 14

        //일단 날짜부터 해결하자
        //하루가 더해질때, 1440분을 더해주면 해결

        int x = D - 11; //날짜 - 11
        int y = H - 11; //시간 - 11
        int z = M - 11; //분 - 11

        if (D < 11 || (D == 11 && (H < 11 || (H == 11 && M < 11)))) {
            System.out.print("-1");
        }
        else {
            int month = x * 1440; //날짜당 분수
            int hour = y * 60;
            int answer = month + hour + z;
            System.out.println(answer);
        }








    }
}

