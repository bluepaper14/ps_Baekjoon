import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        }
        if(input.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        }
        if(input.equals("KIS")) {
            System.out.println("Korea International School");
        }
        if(input.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }

    }
}