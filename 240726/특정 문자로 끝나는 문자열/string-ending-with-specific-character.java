import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = br.readLine();
        }

        String str = br.readLine();
        char ch = str.charAt(0);

        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length()-1) == ch) {
                sb.append(arr[i] + "\n");
                cnt++;
            }
        }
        
        if (cnt == 0) {
            sb.append("None");
        }

        System.out.println(sb);
    }
}