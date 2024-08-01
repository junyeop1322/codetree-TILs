import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(checkDate(m, d));
    }

    static String checkDate(int m, int d) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (m < 1 || m > 12) {
            return "No";
        }
        
        if (d <= month[m]) {
            return "Yes";
        } else {
            return "No";
        }
    }
}