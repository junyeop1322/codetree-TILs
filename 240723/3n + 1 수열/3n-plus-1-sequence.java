import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int num = Integer.parseInt(br.readLine());

        while(true) {
            if (num == 1) {
                System.out.println(cnt);
                break;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            cnt++;
        }
        
    }
}