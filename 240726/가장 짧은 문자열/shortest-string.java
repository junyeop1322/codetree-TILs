import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
            int len = arr[i].length();
            max = Math.max(max, len);
            min = Math.min(min, len);
        }

        System.out.println(max-min);

    }
}