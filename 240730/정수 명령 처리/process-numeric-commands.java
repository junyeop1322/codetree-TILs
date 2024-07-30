import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();

            switch(order) {
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    stk.push(num);
                    break;
                case "size" :
                    sb.append(stk.size() + "\n");
                    break;
                case "pop" :
                    sb.append(stk.pop() + "\n");
                    break;
                case "empty" :
                    if (stk.empty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}