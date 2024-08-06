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

        int a = 0;
        int b = 0;
        int check = 0;
        int cnt = 0;

        int cntA = 0;
        int cntB = 0;
        int idxA = 0;
        int idxB = 0;
        
        while (true) {
            int av = arr[idxA][0];
            int at = arr[idxA][1];

            int bv = brr[idxB][0];
            int bt = brr[idxB][1];

            a += av;
            b += bv;

            cntA++;
            cntB++;

            if (check == 0) {
                if (a > b) {
                    check = 1;
                    cnt++;
                } else if (a < b) {
                    check = 2;
                    cnt++;
                }
            } else if (check == 1) {
                if (a == b) {
                    check = 0;
                    cnt++;
                } else if (a < b) {
                    check = 2;
                    cnt++;
                }
            } else if (check == 2) {
                if (a == b) {
                    check = 0;
                    cnt++;
                } else if (a > b) {
                    check = 1;
                    cnt++;
                }
            }

            if (cntA == at) {
                idxA++;
                cntA = 0;
            }

            if (cntB == bt) {
                idxB++;
                cntB = 0;
            }

            if (idxA == n && idxB == m) {
                break;
            }

        }

        System.out.println(cnt);
    }
}