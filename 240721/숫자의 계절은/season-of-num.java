import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        String str = "";

        if (m >= 3 && m <= 5) {
            str = "Spring";
        } else if (m >= 6 && m <= 8) {
            str = "Summer";
        } else if (m >= 9 && m <= 11) {
            str = "Fall";
        } else if ((m >= 1 && m <= 2) || m == 12) {
            str = "Winter";
        }

        System.out.println(str);
    }
}