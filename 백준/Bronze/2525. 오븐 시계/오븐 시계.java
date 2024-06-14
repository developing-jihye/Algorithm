import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();
        int addM = in.nextInt();

        // 추가될 분을 기존 분에 더하기
        M += addM;

        // 만약 분이 60 이상이면 시간으로 변환
        if (M >= 60) {
            H += M / 60;
            M %= 60;
        }

        // 만약 시간이 24 이상이면 0부터 다시 시작
        if (H >= 24) {
            H %= 24;
        }

        System.out.println(H + " " + M);
    }
}
