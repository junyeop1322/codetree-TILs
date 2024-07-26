import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "");

        String str1 = st.nextToken();

        st = new StringTokenizer(br.readLine(), "");
        String str2 = st.nextToken();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        System.out.println(str1 + str2);
    }
}