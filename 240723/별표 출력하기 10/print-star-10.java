import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ans = new String[n];

        for (int i = 1; i <= n; i++) {
            String str = "";
            if (i % 2 == 1) {
                for (int j = 0; j < (i+1)/2; j++) {
                    str += "* ";
                }
            } else {
                for (int j = 0; j < n - (i/2 - 1); j++) {
                        str += "* ";
                }
            }
            
            ans[i-1] = str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i] + "\n");
        }
        for (int i = n-1; i >= 0; i--) {
            sb.append(ans[i] + "\n");
        }

        System.out.println(sb);
    }
}