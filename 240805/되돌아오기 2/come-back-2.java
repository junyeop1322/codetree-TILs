import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int x = 0;
        int y = 0;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int cnt = 0;

        int v = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch(ch) {
                case 'F':
                    x = x + dx[v];
                    y = y + dy[v];

                    cnt++;

                    if (x == 0 && y == 0) {
                        System.out.println(cnt);
                        return;
                    }

                    break;
                case 'R':
                    v++;

                    if (v > 3) {
                        v = 0;
                    }
                    
                    cnt++;
                    break;
                case 'L':
                    v--;
                    
                    if (v < 0) {
                        v = 3;
                    }

                    cnt++;
                    break;
            }
        }

        System.out.println(-1);
    }
}