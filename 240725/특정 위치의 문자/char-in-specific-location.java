import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = {"L", "E", "B", "R", "O", "S"};

        String s = br.readLine();

        int ans = -1;

        for (int i = 0; i < 6; i++) {
            if (str[i].equals(s)) {
                ans = i;
                break;
            }
        }

        if (ans == -1) {
            System.out.println("None");
        } else {
            System.out.println(ans);
        }
    }
}