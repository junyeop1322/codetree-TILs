import java.io.*;
import java.util.*;

class Point {
    String v;
    int l;

    public Point(String v, int l) {
        this.v = v;
        this.l = l;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Point[] aPoint = new Point[n];
        Point[] bPoint = new Point[m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            aPoint[i] = new Point(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            bPoint[i] = new Point(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        int idxA = 0;
        int idxB = 0;

        int cnt = 0;

        int cntA = 0;
        int cntB = 0;

        int a = 0;
        int b = 0;

        while (true) {
            String ao = aPoint[idxA].v;
            int an = aPoint[idxA].l;

            String bo = bPoint[idxB].v;
            int bn = bPoint[idxB].l;

            if (ao.equals("L")) {
                a--;
                cntA++;
            } else {
                a++;
                cntA++;
            }

            if (bo.equals("L")) {
                b--;
                cntB++;
            } else {
                b++;
                cntB++;
            }

            cnt++;
            if (a == b) {
                System.out.println(cnt);
                return;
            }

            if (cntA == an) {
                cntA = 0;
                idxA++;
            }

            if (cntB == bn) {
                cntB = 0;
                idxB++;
            }

            if (idxA == n || idxB == m) {
                break;
            }
        }

        System.out.println(-1);

    }
}