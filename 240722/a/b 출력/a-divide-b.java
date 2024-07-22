import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        String str = String.format("%.21f", a/b);
        
        String ans = "";

        for (int i = 0; i < str.length()-1; i++) {
            ans += str.charAt(i);
        }

        System.out.println(ans);
    }
}