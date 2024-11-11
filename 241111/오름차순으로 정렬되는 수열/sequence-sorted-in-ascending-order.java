import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 0;
        int idx = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]) {
                num = arr[i+1];
                idx = i+1;
                break;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < idx; i++) {
            if (arr[i] > num) {
                set.add(arr[i]);
            }
        }

        System.out.println(set.size());
    }
}