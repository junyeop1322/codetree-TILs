import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append(1 + " ");
        sb.append(n + " ");
        sb.append(n+1 + " ");
        int num1 = n;
        int num2 = n+1;
        while(true) {
            if (num2 > 100) {
                break;
            }
            int temp = num1;
            num1 = num2;
            num2 = temp + num1;
            sb.append(num2 + " ");

        }

        System.out.println(sb);
    }
}