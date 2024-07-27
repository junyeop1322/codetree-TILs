import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        while(true) {
            String str = br.readLine();
            if (str.equals("END")) {
                break;
            }

            sb = new StringBuilder();
            sb.append(str);

            System.out.println(sb.reverse());
        }
    }
}