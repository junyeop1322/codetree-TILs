import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            if (str.equals("Y")) {
                if (n >= 37) {
                    arr[0]++;
                    cnt++;
                } else {
                    arr[2]++;
                }
            } else {
                if (n >= 37) {
                    arr[1]++;
                } else {
                    arr[3]++;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            sb.append(arr[i] + " ");
        }

        if (cnt >= 2) {
            sb.append("E");
        }

        System.out.println(sb);
        
    }
}