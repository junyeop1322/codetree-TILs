import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                idx = i;
                break;
            }
        }

        str = str.substring(0, idx) + str.substring(idx+1);

        System.out.println(str);
    }
}