import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        System.out.println(findSeq(n));
    }

    static int findSeq(int n) {
        if (n <= 2) {
            return n*2;
        }

        return (findSeq(n-1) * findSeq(n-2)) % 100;
    }
}