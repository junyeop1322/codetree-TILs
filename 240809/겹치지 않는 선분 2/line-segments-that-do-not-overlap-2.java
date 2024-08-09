import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] =Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {

            boolean overlap = false;

            for(int j = 0; j < n; j++) {
                if(j == i) continue;

                if((x1[i] <= x1[j] && x2[i] >= x2[j]) || (x1[i] >= x1[j] && x2[i] <= x2[j])) {
                    overlap = true;
                    break;
                }
            }

            if(overlap == false)
                ans++;
        }

        System.out.print(ans);

    }
}