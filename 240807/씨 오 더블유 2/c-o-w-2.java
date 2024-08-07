import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        if (n < 3) {
            System.out.println(0);
            return;
        }

        int cnt = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (str.charAt(i) == 'C' && str.charAt(j) == 'O' && str.charAt(k) == 'W') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}