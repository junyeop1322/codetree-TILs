import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();

            switch(order) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    break;
                case "pop" :
                    sb.append(q.poll() + "\n");
                    break;
                case "size" :
                    sb.append(q.size() + "\n");
                    break;
                case "empty" :
                    if (q.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front" :
                    if (!q.isEmpty()) {
                        sb.append(q.peek() + "\n");
                    }
            }
        }

        System.out.println(sb);
    }
}