import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double cnt = 0;

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if (num < 20 || num >= 30) {
                System.out.printf("%.2f", sum / cnt);
                break;
            } else {
                sum += num;
                cnt++;
            }

        }
    }
}