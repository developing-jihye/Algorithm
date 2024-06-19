import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int N = in.nextInt();
        int sum = 0;

        for (int i = 0 ; i < N ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            sum += a * b;
        }
        in.close();
        System.out.println(sum == X ? "Yes" : "No");
    }
}