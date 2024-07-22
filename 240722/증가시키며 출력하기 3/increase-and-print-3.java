import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int i = 10;

        StringBuilder sb = new StringBuilder();

        while(true) {
            sb.append(i + " ");

            i += 2;
            if (i > 26) {
                break;
            }
        }

        System.out.println(sb);
    }
}