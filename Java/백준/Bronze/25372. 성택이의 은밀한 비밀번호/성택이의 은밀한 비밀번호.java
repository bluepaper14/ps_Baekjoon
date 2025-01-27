import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(s.length() < 6){
                System.out.println("no");
            }
            else if(s.length() > 9){
                System.out.println("no");
            }
            else {
                System.out.println("yes");
            }
        }




    }
}
