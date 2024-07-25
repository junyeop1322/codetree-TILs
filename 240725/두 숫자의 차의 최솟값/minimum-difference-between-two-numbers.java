import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int min = 100;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        arr[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]-arr[i-1]);
        }

        System.out.println(min);
    }
}