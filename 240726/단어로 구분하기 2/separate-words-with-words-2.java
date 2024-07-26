import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i <= 10; i++) {
            String str = st.nextToken();

            if (i % 2 == 1) {
                System.out.println(str);
            }
        }
    }
}