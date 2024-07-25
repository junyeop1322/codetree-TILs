import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[b];

        while (a > 1) {
            int num = a % b;
            arr[num]++;
            a = a / b;
        }

        int sum = 0;

        for (int i = 0; i < b; i++) {
            sum += arr[i] * arr[i];
        }

        System.out.println(sum);
    }
}