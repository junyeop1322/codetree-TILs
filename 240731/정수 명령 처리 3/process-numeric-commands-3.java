import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            int num;

            switch(order) {
                case "push_front" :
                    num = Integer.parseInt(st.nextToken());

                    dq.addFirst(num);
                    break;
                case "push_back" :
                    num = Integer.parseInt(st.nextToken());

                    dq.addLast(num);
                    break;
                case "pop_front" :
                    sb.append(dq.pollFirst() + "\n");
                    break;
                case "pop_back" :
                    sb.append(dq.pollLast() + "\n");
                    break;
                case "size" :
                    sb.append(dq.size() + "\n");
                    break;
                case "empty" :
                    if (dq.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front" :
                    sb.append(dq.peekFirst() + "\n");
                    break;
                case "back" :
                    sb.append(dq.peekLast() + "\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}