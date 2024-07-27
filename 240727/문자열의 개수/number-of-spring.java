import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        while(true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }
            cnt++;

            if (cnt % 2 == 1) {
                sb.append(str + "\n");
            }
        }
        
        System.out.println(cnt);
        System.out.println(sb);
    }
}