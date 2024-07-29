import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        LinkedList<Character> list = new LinkedList<>();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        int idx = list.size();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();

            if (order.equals("L")) {
                if (idx != 0) {
                    idx--;
                }
            } else if (order.equals("P")) {
                char ch = st.nextToken().charAt(0);
                list.add(idx+1, ch);
            } else if (order.equals("R")) {
                if (idx != list.size()) {
                    idx++;
                }
            } else if (order.equals("D")) {
                if (idx != list.size()) {
                    list.remove(idx);
                }
            }
            // System.out.println(i + " : " + str + " : " + order + " : idx = " + idx);
        }

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}