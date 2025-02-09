import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //소들의 수
        int w = sc.nextInt(); //헛간의 크기(가로)
        int h = sc.nextInt(); //헛간의 크기(세로)
        int l = sc.nextInt(); //소들에게 배정되는 크기

        int x = w / l;
        int y = h / l;

        
        if((x * y) < n) {
            System.out.println(x *  y);
        }
        else {
            System.out.println(n);
        }
    }
}

