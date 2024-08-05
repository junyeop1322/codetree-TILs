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

        double douNum = num - intNum;
        sb.append(".");

        while(douNum > 0) {
            douNum *= 2;
            if (douNum >= 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            if (sb.length() > 4) {
                break;
            }
        }

        System.out.println(strNum + sb.toString());
    }
}