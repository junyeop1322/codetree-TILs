import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        System.out.println(checkYear(n));
    }

    static String checkYear(int n) {
        String str = "";
        if (n % 4 == 0 && (n % 400 == 0 && n % 100 != 0)) {
            str = "true";
        } else {
            str = "false";
        }

        return str;
    }
}