import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 1) {
            a += 3;
        }

        if (a % 3 == 0) {
            a /= 3;
        }

        System.out.println(a);
    }
}