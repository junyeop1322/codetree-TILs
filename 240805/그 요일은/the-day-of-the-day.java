import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
        int idx = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(str)) {
                idx = i;
                break;
            }
        }
        
        int d = 0;

        for (int i = m1; i <= m2; i++) {
            d += month[i];
        }

        d = d - (d1 - 1);
        d = d - (month[m2] - d2 + 1);

        int cnt = 0;

        for (int i = 0; i <= d; i++) {
            if (i % 7 == idx) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}