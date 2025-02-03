import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();

       int n = in.nextInt();

       int sum = a + b;

       if(sum == n) {
           System.out.println("correct!");
       }
       else {
           System.out.println("wrong!");
       }
    }
}
