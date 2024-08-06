import java.io.*;
import java.util.*;

class Ro {
    int t;
    String v;

    public Ro(int t, String v) {
        this.t = t;
        this.v = v;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Ro[] roA = new Ro[n];
        Ro[] roB = new Ro[m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            roA[i] = new Ro(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            roB[i] = new Ro(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        int cnt = 0;

        int idxA = 0;
        int idxB = 0;

        int cntA = 0;
        int cntB = 0;

        int a = 0;
        int b = 0;

        while (true) {
            int at = roA[idxA].t;
            String av = roA[idxA].v;

            int bt = roB[idxB].t;
            String bv = roB[idxB].v;

            boolean check = false;

            if (a != b) {
                check = true;
            }
            
            if (cntA != -1) { 
                if (av.equals("L")) {
                    a--;
                    cntA++;
                } else {
                    a++;
                    cntA++;
                }
            }

            if (cntB != -1) {
                if (bv.equals("L")) {
                    b--;
                    cntB++;
                } else {
                    b++;
                    cntB++;
                }
            }

            // 처음에는 다른 위치에 있다가 같은 위치가 되면 cnt++
            if (check && a == b) {
                cnt++;
            }

            if (cntA == at) {
                idxA++;
                cntA = 0;
            }

            if (cntB == bt) {
                idxB++;
                cntB = 0;
            }

            if (idxA == n) {
                idxA = 0;
                cntA = -1;
            }

            if (idxB == m) {
                idxB = 0;
                cntB = -1;
            }

            if (cntA == -1 && cntB == -1) {
                break;
            }
        }

        System.out.println(cnt);

    }
}