import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // A  바구니 사과
        int b = sc.nextInt(); // A 바구니 오랜지

        int c = sc.nextInt(); // B 바구니 사과
        int d = sc.nextInt(); // B 바구니 오랜지


        //만약에 첫번째 바구니에 사과 바구니로 지정
        //두번째 바구니를 오랜지 바구니로 지정할때
        //b + c
        
        //반래로 첫번째 바구니를 오랜지
        //두번째 바구니를 사과로 지정할때
        //a + d
        
        //즉 2개의 값중 작은 값이 최소값이 된다.
        
        if(b + c > a +d) {
            System.out.println(a + d);
        }
        else {
            System.out.println(b + c);
        }
    }
}
