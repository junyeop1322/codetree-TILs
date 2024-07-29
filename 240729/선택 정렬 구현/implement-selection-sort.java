import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = 0;
        int idx = 0;

        while (true) {
            if (check(arr) || idx == n) {
                break;
            }

            for (int i = idx; i < n; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }

            int temp = arr[idx];
            arr[idx] = arr[min];
            arr[min] = temp;

            idx++;
            min = idx; 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}