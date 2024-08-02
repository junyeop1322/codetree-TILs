import java.io.*;
import java.util.*;

class Point {
    int num;
    int x;
    int y;

    public Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Point[] point = new Point[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            point[i] = new Point(i+1, x, y);
        }

        Arrays.sort(point, (o1, o2) -> {
            if (((int)Math.pow(o1.x, 2) + (int)Math.pow(o1.y, 2)) == ((int)Math.pow(o2.x, 2) + (int)Math.pow(o2.y, 2))) {
                return o2.num - o1.num;
            }
            return ((int)Math.pow(o1.x, 2) + (int)Math.pow(o1.y, 2)) - ((int)Math.pow(o2.x, 2) + (int)Math.pow(o2.y, 2));
        });

        for (int i = 0; i < n; i++) {
            System.out.println(point[i].num);
        }
    }
}