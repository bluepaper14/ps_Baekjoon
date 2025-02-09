import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chicken = sc.nextInt(); //치킨집 구울수 있는 치킨
        int cholla = sc.nextInt(); //콜라 개수
        int bill = sc.nextInt(); //맥주 개수

        int x = cholla / 2;

        int sum = x + bill; //최대로 시킬 수 있는 치킨마리수

        if(chicken > sum) {
            System.out.println(sum);
        }
        else {
            System.out.println(chicken);
        }
    }
}
