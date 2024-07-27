import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        while (str.length() > 1) {
            int num = Integer.parseInt(br.readLine());

            if (num >= str.length()) {
                str = str.substring(0, str.length()-1);
                System.out.println(str);
            } else {
                str = str.substring(0, num) + str.substring(num+1, str.length());
                System.out.println(str);
            }

        }
    }
}