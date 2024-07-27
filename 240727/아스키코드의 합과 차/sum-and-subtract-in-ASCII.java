import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        int a = (int)s1.charAt(0);
        int b = (int)s2.charAt(0);

        System.out.println(a+b + " " + (Math.max(a, b) - Math.min(a, b)));
    }
}