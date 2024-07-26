import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];
        int pro = 1;

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (cnt == 2) {
                System.out.println(arr[0]*arr[1]*arr[2]);
                return;
            }

            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println(arr[0]*arr[1]*arr[2]);
            return;
        } else {
            for (int i = 0 ; i < 3; i++) {
                if (arr[i] % 2 != 0) {
                    pro *= arr[i];
                }
            }
            System.out.println(pro);
        }


    }
}