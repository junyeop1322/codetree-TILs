import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        String str = br.readLine();
        char ch = str.charAt(0);

        int cnt = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(3) == ch || arr[i].charAt(2) == ch) {
                sb.append(arr[i] + "\n");
                cnt++;
            }
        }

        sb.append(cnt + "\n");

        System.out.println(sb);

    }
}