import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        if (str1.length() == str2.length()) {
            System.out.println("same");
        } else if (str1.length() > str2.length()) {
            System.out.println(str1 + " " + str1.length());
        } else {
            System.out.println(str2 + " " + str2.length());
        }
    }
}