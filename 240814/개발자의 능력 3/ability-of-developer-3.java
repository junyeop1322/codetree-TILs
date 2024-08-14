import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                for (int k = j+1; k < 6; k++) {
                    int sum1 = arr[i] + arr[j] + arr[k];
                    int sum2 = 0;
                    for (int l = 0; l < 6; l++) {
                        if (l != i && l != j && l != k) {
                            sum2 += arr[l];
                        }
                    }

                    ans = Math.min(Math.abs(sum1 - sum2), ans);
                }
            }
        }

        System.out.println(ans);
    }
}