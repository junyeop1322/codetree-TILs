import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb;

        for (int i = 0; i < n; i++) {
            sb = new StringBuilder();

            String str = br.readLine();

            sb.append(str);

            System.out.println(sb.reverse());

        }
    }
}