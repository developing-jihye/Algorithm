import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int v = in.nextInt();

        int count = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == v) {
                count++;
            }
        }
        System.out.println(count);

    }
}