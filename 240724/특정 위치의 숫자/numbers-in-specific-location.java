import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(arr[3] + arr[5] + arr[10]);
    }
}