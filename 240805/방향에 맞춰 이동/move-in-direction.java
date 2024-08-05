import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            switch(str) {
                case "N" :
                    x += num;
                    break;
                case "E" :
                    y += num;
                    break;
                case "W" :
                    y -= num;
                    break;
                case "S" :
                    x -= num;
                    break;
            }
        }

        System.out.println(y + " " + x);
    }
}