import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c) { // 같은 눈 3개
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || a == c) { // 같은 눈 2개
            int sameNum = (a == b) ? a : (a == c) ? a : c;
            System.out.println(1000 + sameNum * 100);
        } else { // 같은 눈 없음
            int maxNum = Math.max(a, Math.max(b, c));
            System.out.println(maxNum * 100);
        }
    }
}