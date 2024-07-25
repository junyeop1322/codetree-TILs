import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[2][4];

        double row1 = 0;
        double row2 = 0;
        double clu1 = 0;
        double clu2 = 0;
        double clu3 = 0;
        double clu4 = 0;
        double sum = 0;

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;

                sum += num;

                if (i == 0) {
                    row1 += num;
                } else {
                    row2 += num;
                }

                if (j == 0) {
                    clu1 += num;
                } else if (j == 1) {
                    clu2 += num;
                } else if (j == 2) {
                    clu3 += num;
                } else {
                    clu4 += num;
                }
            }
        }

        System.out.printf("%.1f %.1f\n", row1/4, row2/4);
        System.out.printf("%.1f %.1f %.1f %.1f\n", clu1/2, clu2/2, clu3/2, clu4/2);
        System.out.printf("%.1f\n", sum/8);
    }
}