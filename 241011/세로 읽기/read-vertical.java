import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();

            max = Math.max(max, arr[i].length());
        }

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < max; i++) {
            for (String str : arr) {
                if (i < str.length()) {
                    sb.append(str.charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}