import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] cows = new String[3];
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < 3; j++) {
                cows[j] = st.nextToken();
            }

            Arrays.sort(cows);

            String key = String.join(" ", cows);

            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }
        
        int maxCount = Collections.max(countMap.values());

        System.out.println(maxCount);

    }
}