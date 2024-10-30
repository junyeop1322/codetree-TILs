import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map.put(input[1], map.getOrDefault(input[1], 0) + 1);
        }

        int ans = 1;
        for (int cnt : map.values()) {
            ans *= (cnt+1);
        }

        System.out.println(ans-1);

    }
}