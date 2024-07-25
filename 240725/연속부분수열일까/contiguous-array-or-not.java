import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        String str = "No";

        for (int i = 0; i < n-m; i++) {
            if (arr1[i] == arr2[0]) {
                int idx = i;
                int check = 0;
                for (int j = 0; j < m; j++) {
                    if (arr2[j] != arr1[idx]) {
                        check = 1;
                        break;
                    }
                    idx++;
                }

                if (check == 0) {
                    str = "Yes";
                    break;
                }
            }
        }

        System.out.println(str);
    }
}