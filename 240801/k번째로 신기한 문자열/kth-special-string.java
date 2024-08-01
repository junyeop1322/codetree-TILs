import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean check = true;

            if (arr[i].length() < str.length()) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (arr[i].charAt(j) != str.charAt(j)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                cnt++;
                if (cnt == k) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}