import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //고속철도
        int b = sc.nextInt(); //항공편

        if(a <= b) {
            System.out.println("high speed rail");
        }
        else {
            System.out.println("flight");
        }

    }
}

// 역a -> 역b 항공편이 덜 걸리네? => 항공편 이용 아니면 고속철도
//고속철도의 이용시간 Sab
//항공편의 이용시간 역a -> 공항a -> 공항b -> 역b  Fab