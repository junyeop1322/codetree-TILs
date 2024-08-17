import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());

        if (n % 2 == 0) {
            System.out.println(func(100));
        } else {
            System.out.println(func(99));
        }
        
    }

    static int func(int num) {
        if (num == n) {
            return num;
        }

        return num + func(num-2);
    }
}