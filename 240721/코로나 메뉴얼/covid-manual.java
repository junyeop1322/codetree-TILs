import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] check = new String[3];
        int[] temp = new int[3];

        int cnt = 0;

        for (int i = 0; i < 3; i++) {            
            st = new StringTokenizer(br.readLine(), " ");
            check[i] = st.nextToken();
            temp[i] = Integer.parseInt(st.nextToken());

            if (check[i].equals("Y") && temp[i] >= 37) {
                cnt++;
            }
        }

        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }


    }
}