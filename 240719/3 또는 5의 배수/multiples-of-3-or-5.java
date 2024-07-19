import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String str1;
        String str2;

        if (a % 3 == 0) {
            str1 = "YES";
        } else {
            str1 = "NO";
        }

        if (a % 5 == 0) {
            str2 = "YES";
        } else {
            str2 = "NO";
        }

        System.out.println(str1);
        System.out.println(str2);
    }
}