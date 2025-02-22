import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();

        int countWithoutY = 0;
        int countWithY = 0;

        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                countWithoutY++;
                countWithY++;
            } else if (c == 'y') {
                countWithY++;
            }
        }

        System.out.println(countWithoutY + " " + countWithY);
    }
}
