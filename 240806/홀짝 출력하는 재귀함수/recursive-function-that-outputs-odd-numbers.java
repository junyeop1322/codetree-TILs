import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fun(n);
    }

    static void fun(int n) {
        if (n <= 2) {
            System.out.print(n + " ");
            return;
        }

        fun(n-2);
        System.out.print(n + " ");
    }
}