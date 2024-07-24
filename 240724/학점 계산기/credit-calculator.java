import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        double sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int t = 0; t < n; t++) {
            double num = Double.parseDouble(st.nextToken());
            sum += num;
        }

        double avg = sum / n;
        // sb.append("%.1f\n", avg);
        System.out.printf("%.1f\n", avg);

        if (avg >= 4.0) {
            sb.append("Perfect\n");
        } else if (avg >= 3.0) {
            sb.append("Good\n");
        } else {
            sb.append("Poor\n");
        }

        System.out.println(sb);
    }
}