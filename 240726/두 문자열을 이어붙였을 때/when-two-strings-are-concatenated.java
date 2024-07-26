import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        if ((str1 + str2).equals(str2 + str1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}