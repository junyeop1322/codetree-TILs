import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[10];

        while(true) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }

            int num = n / 10;

            arr[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            sb.append(i + " - " + arr[i] + "\n");
        }

        System.out.println(sb);
    }
}