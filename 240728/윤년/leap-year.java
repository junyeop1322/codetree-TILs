import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}