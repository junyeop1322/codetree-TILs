import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                break;
            }

            arr[i] = num;
        }
        
        for (int i = 9; i >= 0; i--) {
            if (arr[i] != 0) {
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb);
        

    }
}