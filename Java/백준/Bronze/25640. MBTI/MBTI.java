import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            String x = sc.nextLine();
            if(s.equals(x)) {
                cnt++;
            }
        }
        System.out.println(cnt);



    }
}
