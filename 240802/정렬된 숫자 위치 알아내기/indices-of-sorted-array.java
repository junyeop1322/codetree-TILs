import java.io.*;
import java.util.*;

class Point {
    int n;
    int num;

    public Point(int n, int num) {
        this.n = n;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        Point[] point = new Point[n];
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            point[i] = new Point(i+1, num);
            arr[i] = i+1;
        }

        Arrays.sort(point, (o1, o2) -> {
            if (o1.num == o2.num) {
                return o1.n - o2.n;
            } else {
                return o1.num - o2.num;
            }
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == point[j].n) {
                    System.out.print((j+1) + " ");
                    break;
                }
            }
        }
    }
}