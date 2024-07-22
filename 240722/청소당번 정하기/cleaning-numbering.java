import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                cnt3++;
            } else if (i % 6 == 0) {
                cnt2++;
            } else if (i % 3 == 0) {
                cnt2++;
            } else if (i % 2 == 0) {
                cnt1++;
            }
        }

        System.out.println(cnt1 + " " + cnt2 + " " + cnt3);
    }
}