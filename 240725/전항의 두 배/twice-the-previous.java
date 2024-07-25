import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb.append(a + " ");
        sb.append(b + " ");

        arr[0] = a;
        arr[1] = b;

        for (int i = 2; i <= 9; i++) {
            arr[i] = arr[i-1] + 2 * arr[i-2];
            sb.append(arr[i] + " ");
        }

        System.out.println(sb);
    }
}