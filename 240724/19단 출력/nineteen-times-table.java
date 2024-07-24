import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                sb.append(i + " * " + j + " = " + i*j);
                if (j % 2 == 1 && j != 19) {
                    sb.append(" / ");
                } else {
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}