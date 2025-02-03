import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String input = in.next();

            if(input.equals("Algorithm")) {
                System.out.println("204");
            }
            if(input.equals("DataAnalysis")) {
                System.out.println("207");
            }
            if(input.equals("ArtificialIntelligence")) {
                System.out.println("302");
            }
            if(input.equals("CyberSecurity")) {
                System.out.println("B101");
            }
            if(input.equals("Network")) {
                System.out.println("303");
            }
            if(input.equals("Startup")) {
                System.out.println("501");
            }
            if(input.equals("TestStrategy")) {
                System.out.println("105");
            }

        }
    }
}
