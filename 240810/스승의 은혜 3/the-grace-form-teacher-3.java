import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int maxStudents = 0;

        for (int i = 0; i < n; i++) {
            int[] totalCosts = new int[n];
            int total = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    totalCosts[j] = arr[j][0] / 2 + arr[j][1];  // 쿠폰 사용
                } else {
                    totalCosts[j] = arr[j][0] + arr[j][1];  // 원래 가격
                }
            }

            Arrays.sort(totalCosts);
            int count = 0;

            for (int cost : totalCosts) {
                if (total + cost <= p) {
                    total += cost;
                    count++;
                } else {
                    break;
                }
            }

            maxStudents = Math.max(maxStudents, count);
        }

        System.out.println(maxStudents);

    }
}