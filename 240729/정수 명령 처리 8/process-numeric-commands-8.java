import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            String order = st.nextToken();

            if (order.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                list.addFirst(num);
            } else if (order.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                list.addLast(num);
            } else if (order.equals("pop_front")) {
                sb.append(list.get(0) + "\n");
                list.removeFirst();
            } else if (order.equals("pop_back")) {
                sb.append(list.get(list.size()-1) + "\n");
                list.removeLast();
            } else if (order.equals("size")) {
                sb.append(list.size() + "\n");
            } else if (order.equals("empty")) {
                if (list.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            } else if (order.equals("front")) {
                sb.append(list.get(0) + "\n");
            } else if (order.equals("back")) {
                sb.append(list.get(list.size() -1) + "\n");
            }
        }

        System.out.println(sb);
    }
}