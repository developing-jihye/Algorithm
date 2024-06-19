import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        // 반복문 밖에서 StringTokenizer 참조 변수 선언 => 가독성
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            // 반복문 안에서 StringTokenizer 객체 초기화
            // .readLine(): 스트림에서 한 줄을 읽어서 문자열로 반환. 예외 처리 필수
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}