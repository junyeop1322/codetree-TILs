import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        StringBuilder sb = new StringBuilder();

        int i = 10;

        while(true) {
            sb.append(i + " ");

            i++;

            if (i > 26) {
                break;
            }
        }

        System.out.println(sb);
    }
}