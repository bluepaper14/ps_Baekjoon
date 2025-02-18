import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 분석할 일 수
        int[] trainingDays = new int[n];
        int totalMuscleGain = 0;
        
        for (int i = 0; i < n; i++) {
            trainingDays[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 아침 몸무게
            int y = sc.nextInt(); // 저녁 몸무게
            
            if (trainingDays[i] == 1 && y > x) {
                totalMuscleGain += (y - x);
            }
        }
        
        System.out.println(totalMuscleGain);
        sc.close();
    }
}