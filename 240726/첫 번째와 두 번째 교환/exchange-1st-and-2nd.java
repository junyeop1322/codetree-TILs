import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        str = str.replace(ch1, ' ');
        str = str.replace(ch2, ch1);
        str = str.replace(' ', ch2);

        System.out.println(str);
    }
}