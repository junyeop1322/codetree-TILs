import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int pro = 1;

        for (int i = 1; i <= 10; i++) {
            pro *= i;

            if (pro >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}