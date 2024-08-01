import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        powSum(str, 0, 0);
    }
    
    static void powSum(String str, int num, int sum) {
        if (num == str.length()) {
            System.out.println(sum);
            return;
        }

        powSum(str, num+1, sum + (int)Math.pow((str.charAt(num) - '0'), 2));

    }

}