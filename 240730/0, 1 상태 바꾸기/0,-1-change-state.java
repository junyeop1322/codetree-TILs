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
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            switch(num) {
                case 1 :
                    arr[a-1] = b;

                    break; 
                case 2 :
                    for (int j = a-1; j <= b-1; j++) {
                        if (arr[j] == 0) {
                            arr[j] = 1;
                        } else if (arr[j] == 1) {
                            arr[j] = 0;
                        }
                    }

                    break;
                case 3 :
                    for (int j = a-1; j <= b-1; j++) {
                        arr[j]= 0;
                    }

                    break;
                case 4 :
                    for (int j = a-1; j <= b-1; j++) {
                        arr[j] = 1;
                    }

                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}