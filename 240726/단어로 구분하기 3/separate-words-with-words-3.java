import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = st.nextToken();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}