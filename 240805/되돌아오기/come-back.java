import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String o = st.nextToken();
            int d = Integer.parseInt(st.nextToken());

            switch (o) {
                case "N" :
                    for (int j = 0; j < d; j++) {
                        y++;
                        cnt++;
                        if (x == 0 && y == 0) {
                            System.out.println(cnt);
                            return;
                        }
                    }
                    break;
                case "W" :
                    for (int j = 0; j < d; j++) {
                        x--;
                        cnt++;
                        if (x == 0 && y == 0) {
                            System.out.println(cnt);
                            return;
                        }
                    }
                    break;
                case "E" :
                    for (int j = 0; j < d; j++) {
                        x++;
                        cnt++;
                        if (x == 0 && y == 0) {
                            System.out.println(cnt);
                            return;
                        }
                    }
                    break;
                case "S" :
                    for (int j = 0; j < d; j++) {
                        y--;
                        cnt++;
                        if (x == 0 && y == 0) {
                            System.out.println(cnt);
                            return;
                        }
                    }
                    break;
            }
        }

        System.out.println(-1);
    }
}