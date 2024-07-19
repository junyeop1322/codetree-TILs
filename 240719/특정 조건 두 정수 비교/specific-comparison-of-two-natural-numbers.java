import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num1;
        int num2;

        if (a < b) {
            num1 = 1;
        } else {
            num1 = 0;
        }

        if (a == b) {
            num2 = 1;
        } else {
            num2 = 0;
        }

        System.out.println(num1 + " " + num2);
    }
}