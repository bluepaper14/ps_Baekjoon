import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int home = sc.nextInt(); //집 -> 학교
        int shcool = sc.nextInt(); //학교 -> pc
        int pc = sc.nextInt(); //pc -> 학원
        int last = sc.nextInt(); //학원 -> 집

        int sum = home+shcool+pc + last;

        int y = sum / 60;
        int x = sum % 60;


        System.out.println(y);
        System.out.println(x);
    }
}


