import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = "N";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                str = "C";
                break;
            }
        }

        System.out.println(str);
    }
}