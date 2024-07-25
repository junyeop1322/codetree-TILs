import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.parseInt(st.nextToken());
        list.add(1);
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                    list.add(i);
                }
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb);
    }
}