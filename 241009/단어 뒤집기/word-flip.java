import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        boolean check = false;

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '<') {
                while(!stk.isEmpty()) {
                    sb.append(stk.pop());
                }

                check = true;
            } else if (ch == '>') {
                check = false;
                sb.append(ch);
                continue;
            }

            if (check) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    while(!stk.isEmpty()) {
                        sb.append(stk.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stk.push(ch);
                }
            }

            if (i == str.length() - 1) {
                while(!stk.isEmpty()) {
                    sb.append(stk.pop());
                }
            }
        }

        System.out.println(sb);
    }
}