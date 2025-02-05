import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //n학년 이하
        int n = sc.nextInt(); //M학년

        if(n < 3) {
            System.out.println("NEWBIE!");
        }
        else if(n <= m) {
            System.out.println("OLDBIE!");
        }
        else {
            System.out.println("TLE!");
        }
    }

}

//뉴비 : 1,2학년
//올드비 : 1,2학년 + n학년이하
//TLE : 뉴비 x 올드비 x