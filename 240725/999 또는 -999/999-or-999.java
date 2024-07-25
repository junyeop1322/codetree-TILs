import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 999 || num == -999) {
                break;
            }

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(max + " " + min);
    }
}