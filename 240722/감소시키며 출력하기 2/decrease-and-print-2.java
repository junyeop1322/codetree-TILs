import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        StringBuilder sb = new StringBuilder();
        int num = 26;
        while(true) {
            if (num < 10) {
                break;
            }

            sb.append(num + " ");
            num--;
        }

        System.out.println(sb);
    }
}