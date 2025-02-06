import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =  sc.nextDouble();
        double b =  sc.nextDouble();
        double c =  sc.nextDouble();


        int sum = (int) ( a * b / c);
        int sum2 = (int) (a / b * c);

        if(sum > sum2) {
            System.out.println(sum);
        }
        else {
            System.out.println(sum2);
        }
    }

}
