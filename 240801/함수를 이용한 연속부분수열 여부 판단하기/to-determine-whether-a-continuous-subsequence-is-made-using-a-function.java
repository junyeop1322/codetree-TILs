import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] brr = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(check(arr, brr));
    }

    static String check(int[] arr, int[] brr) {

        for (int i = 0; i <= arr.length - brr.length; i++) {
            if (arr[i] == brr[0]) {
                boolean chk = true;
                for (int j = 0; j < brr.length; j++) {
                    if (arr[i+j] != brr[j]) {
                        chk = false;
                        break;
                    }
                }

                if (chk) {
                    return "Yes";
                }
            }

        }

        return "No";

    }
}