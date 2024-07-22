import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= 8; i++) {
            int num = i * 2 + 1;
            sb.append(num + " ");
        }

        System.out.println(sb);
    }
}