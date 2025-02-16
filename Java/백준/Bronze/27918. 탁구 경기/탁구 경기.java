import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //n개의 라운드 제공
        int cnt = 0; //달구
        int srd = 0; //피닉스

        char[] arrays = new char[n]; //라운드 마다 배열 생성

        for(int i = 0; i < n; i++) {
            arrays[i] = scanner.next().charAt(0); //첫 글자 입력을 arrays 1번에 입력 - 이게 핵심이었음
        }

        for(int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 'D') { //달구가 이긴다면
                cnt++;
            }

            if (arrays[i] == 'P') { //포닉스가 이긴다면
                srd++;
            }
            int result = Math.abs(cnt - srd);
            if(result >= 2) {
                break;
            }
        }
        System.out.print(cnt + ":" + srd);

    }
}

