import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    sum += num;
                } else if (j == 1 && i > 0) {
                    sum += num;
                } else if (j == 2 && i > 1) {
                    sum += num;
                } else if (j == 3 && i > 2) {
                    sum += num;
                } 
            }
        }

        System.out.println(sum);
    }
}