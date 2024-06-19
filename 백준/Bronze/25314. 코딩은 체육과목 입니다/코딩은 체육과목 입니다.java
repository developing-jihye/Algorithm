import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        String result = "";

        for (int i = 0; i < N/4; i++) {
            result += "long ";
        }

        System.out.println(result + "int");
    }
}