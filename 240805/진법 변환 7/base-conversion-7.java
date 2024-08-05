import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double num = Double.parseDouble(br.readLine());

        int intNum = (int)num;
        String strNum = Integer.toString(intNum, 2);

        double fracNum = num - intNum;
        sb.append(".");

        for (int i = 0; i < 4; i++) { // 소수 부분을 네 자리까지 구하기 위해 반복
            fracNum *= 2;
            if (fracNum >= 1) {
                sb.append("1");
                fracNum -= 1;
            } else {
                sb.append("0");
            }
        }

        System.out.println(strNum + sb.toString());
    }
}