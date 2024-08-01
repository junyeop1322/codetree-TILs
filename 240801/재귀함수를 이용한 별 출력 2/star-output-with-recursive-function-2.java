import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        printStar(n);

        System.out.println(sb);
    }

    static void printStar(int num) {
        if (num == 0) {
            return;
        }

        for (int i = 0; i < num; i++) {
            sb.append("* ");
        }
        sb.append("\n");
        
        printStar(num-1);

        for (int i = 0; i < num; i++) {
            sb.append("* ");
        }
        sb.append("\n");
    }
}