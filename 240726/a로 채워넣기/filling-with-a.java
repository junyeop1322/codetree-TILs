import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(str);

        sb.setCharAt(1, 'a');
        sb.setCharAt(str.length()-2, 'a');

        System.out.println(sb);
    }
}