import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);

        if(a == 'M') System.out.println("MatKor");
        if(a == 'W') System.out.println("WiCys");
        if(a == 'C') System.out.println("CyKor");
        if(a == 'A') System.out.println("AlKor");
        if(a == '$') System.out.println("$clear");
    }
}
