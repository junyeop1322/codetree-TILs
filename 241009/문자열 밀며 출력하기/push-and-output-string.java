import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1, str.length()) + str.substring(0, 1);

            System.out.println(str);
        }
    }
}