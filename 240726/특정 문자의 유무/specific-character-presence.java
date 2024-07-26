import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        if (str.contains("ee")) {
            sb.append("Yes ");
        } else {
            sb.append("No ");
        }

        if (str.contains("ab")) {
            sb.append("Yes ");
        } else {
            sb.append("No ");
        }

        System.out.println(sb);
    }
}