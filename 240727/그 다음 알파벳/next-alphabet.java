import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = br.readLine().charAt(0);

        if (ch == 'z') {
            System.out.println('a');
        } else {
            System.out.println((char)((int)ch + 1));
        }
    }
}