import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();

            if (order.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                list.add(num);
            } else if (order.equals("pop_back")) {
                list.remove(list.size()-1);
            } else if (order.equals("size")) {
                sb.append(list.size() + "\n");
            } else if (order.equals("get")) {
                int num = Integer.parseInt(st.nextToken());
                sb.append(list.get(num-1) + "\n");
            }
        }

        System.out.println(sb);
    }
}