import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 100; i++) {
            int num1 = i % 3;
            int num2;
            if (num1 == 2) {
                num2 = 0;
            } else {
                num2 = num1+1;
            }

            if (arr[num2][0] >= arr[num1][1] + arr[num2][1]) {
                arr[num2][1] += arr[num1][1];
                arr[num1][1] = 0;
            } else {
                arr[num1][1] = arr[num1][1] + arr[num2][1] - arr[num2][0];
                arr[num2][1] = arr[num2][0];
            }
        }

        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][1]);
    }
}