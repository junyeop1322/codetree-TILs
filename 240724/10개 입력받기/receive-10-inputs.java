import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                break;
            }
            
            sum += num;
            cnt++;
        }

        System.out.printf("%.0f %.1f", sum, sum/cnt);
    }
}