import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				for (int i = 0; i < o1.length(); i++) {
					if (o1.charAt(i) != o2.charAt(i)) {
						return o1.charAt(i) - o2.charAt(i);
					}
				}
			}
			return o1.length() - o2.length();
		});

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}