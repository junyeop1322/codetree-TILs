import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stk.push(ch);
            } else {
                if (stk.empty()) {
                    System.out.println("No");
                    return;
                }

                stk.pop();
            }
        }

        if (stk.empty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}