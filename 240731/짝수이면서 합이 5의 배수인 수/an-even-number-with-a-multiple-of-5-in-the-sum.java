import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        System.out.println(find(n));
    }

    static String find(int n) {
        if (n % 2 == 0 && (((n/10) + (n%10)) % 5 == 0)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}