// import java.io.*;
// import java.util.*;

// public class Main {

//     static int n, m;
//     static int[][] arr;
//     static int ans;

//     public static void main(String[] args) throws IOException {
//         // 여기에 코드를 작성해주세요.
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         n = Integer.parseInt(st.nextToken());
//         m = Integer.parseInt(st.nextToken());

//         arr = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             st = new StringTokenizer(br.readLine(), " ");
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = Integer.parseInt(st.nextToken());
//             }
//         }

//         ans = -1;

//         func(1, 1);

//         System.out.println(ans);
//     }

//     static void func(int x, int y) {
//         if (x == n + 1 || y == m + 1) {
//             return;
//         }

//         boolean check = false;
//         boolean chk = false;

//         for (int i = 0; i <= n - x; i++) {
//             for (int j = 0; j <= m - y; j++) {
//                 check = true;
//                 for (int k = i; k < i + x; k++) {
//                     for (int l = j; l < j + y; l++) {
//                         if (arr[k][l] <= 0) {
//                             check = false;
//                         }
//                     }
//                 }

//                 if (check) {
//                     ans = Math.max(ans, x * y);

//                     func(x+1, y);
//                     func(x, y+1);

//                     return;
//                 }
//             }

//         }
//     }
// }

import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxArea = -1;

        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                for (int x2 = x1; x2 < n; x2++) {
                    for (int y2 = y1; y2 < m; y2++) {
                        if (isPositiveRectangle(x1, y1, x2, y2)) {
                            int width = x2 - x1 + 1;
                            int height = y2 - y1 + 1;
                            maxArea = Math.max(maxArea, width * height);
                        }
                    }
                }
            }
        }

        System.out.println(maxArea);
    }

    static boolean isPositiveRectangle(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (arr[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}