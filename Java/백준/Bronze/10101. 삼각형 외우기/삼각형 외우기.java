import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n + n1 + n2;

        if(n == 60 && n1 == 60 && n2 == 60) {
            System.out.println("Equilateral");
        }
        else if(sum == 180) {
            if(n == n1 || n == n2 || n1 == n2) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }

    }
}

//세 각의 크기가 모두 60이면, Equilateral
//세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
//세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
//세 각의 합이 180이 아닌 경우에는 Error