import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() / 2; //빵2개
        int b = sc.nextInt(); //패티1개

        if(b <= a) { //만약 패티보다 빵이 많아도
            System.out.println(b);
        }
        else { //빵이 적다면
            System.out.println(a);
        }


    }
}
