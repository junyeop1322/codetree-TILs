import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());

        String str = "";

        if (y % 4 == 0) {
            str = "true";

            if (y % 100 == 0 && y % 400 != 0) {
                str = "false";
            }
        } else {
            str = "false";
        }

        System.out.println(str);
    }
}