import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 4; j++) {
                if (str[j].length() > i) {
                    sb.append(str[j].charAt(i));
                }
            }
        }

        System.out.println(sb);
    }
}