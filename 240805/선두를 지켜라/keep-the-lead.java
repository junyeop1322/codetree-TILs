import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];
        int[][] brr = new int[m][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            brr[i][0] = Integer.parseInt(st.nextToken());
            brr[i][1] = Integer.parseInt(st.nextToken());
        }

        int cntA = 0;
        int cntB = 0;
        int idxA = 0;
        int idxB = 0;

        int cnt = 0;
        int check;

        if (arr[0][0] > brr[0][0]) {
            check = 1;
        } else if (arr[0][0] == brr[0][0]) {
            check = 0;
        } else {
            check = 2;
        }

        int a = 0;
        int b = 0;

        while(true) {
            int av = arr[idxA][0];
            int at = arr[idxA][1];

            int bv = brr[idxB][0];
            int bt = brr[idxB][1];

            a += av;
            cntA++;
            
            b += bv;
            cntB++;

            if (check == 0 && a != b) {
                if (a > b) {
                    check = 1;
                } else {
                    check = 2;
                }
            }

            if (check == 1 && b > a) {
                cnt++;
                check = 2;
            }

            if (check == 2 && a > b) {
                cnt++;
                check = 1;
            }

            if (cntA == at) {
                idxA++;
                cntA = 0;
            }

            if (cntB == bt) {
                idxB++;
                cntB = 0;
            }

            if (idxA == n || idxB == m) {
                break;
            }

        }

        System.out.println(cnt);

    }
}