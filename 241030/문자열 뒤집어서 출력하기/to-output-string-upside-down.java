import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            sb = new StringBuilder();
            sb.append(br.readLine());

            list.add(sb.reverse().toString());
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}