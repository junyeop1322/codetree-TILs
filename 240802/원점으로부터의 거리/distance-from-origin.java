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
            if ((Math.abs(o1.x) + Math.abs(o1.y)) == (Math.abs(o2.x) + Math.abs(o2.y))) {
                return o1.num - o2.num;
            }
            return (Math.abs(o1.x) + Math.abs(o1.y)) - (Math.abs(o2.x) + Math.abs(o2.y));
        });

        for (int i = 0; i < n; i++) {
            System.out.println(point[i].num);
        }
    }
}