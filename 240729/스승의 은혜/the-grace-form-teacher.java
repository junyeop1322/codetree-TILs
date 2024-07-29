import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            int sum1 = o1[0] + o1[1];
            int sum2 = o2[0] + o2[1];

            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int cost = arr[i][0] + arr[i][1];

            if (sum + cost <= money) {
                sum += cost;
                cnt++;
            } else {
                cost = (arr[i][0] / 2) + arr[i][1];

                if (sum + cost <= money) {
                    cnt++;
                }
                break;
            }
        }

        System.out.println(cnt);

    }
}