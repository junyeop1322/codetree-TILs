import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if ((n % 3 == 0 && n % 2 == 1) || (n % 5 == 0 && n % 2 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}