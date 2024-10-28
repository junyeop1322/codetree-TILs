import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        Queue<int[]> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            queue.add(new int[] { Integer.parseInt(st.nextToken()), i });
        }

        int count = 0;

        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            boolean hasLarger = false;

            for (int[] q : queue) {
                if (q[0] > front[0]) {
                    hasLarger = true;
                    break;
                }
            }

            if (hasLarger) {
                queue.add(front);
            } else {
                count++;
                if (front[1] == x) {
                    System.out.println(count);
                    return;
                }
            }
        }


    }
}