import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String order = st.nextToken();

        for (int i = 0; i < t; i++) {
            if (order.equals("L")) {
                if (y == 1) {
                    order = "R";
                } else {
                    y--;
                }
            } else if (order.equals("R")) {
                if (y == n) {
                    order = "L";
                } else {
                    y++;
                }
            } else if (order.equals("U")) {
                if (x == 1) {
                    order = "D";
                } else {
                    x--;
                }
            } else if (order.equals("D")) {
                if (x == n) {
                    order = "U";
                } else {
                    x++;
                }
            }
        }

        System.out.println(x + " " + y);

    }
}