import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str;

        if (n >= 90) {
            str = "A";
        } else if (n >= 80) {
            str = "B";
        } else if (n >= 70) {
            str = "C";
        } else if (n >= 60) {
            str = "D";
        } else {
            str = "F";
        }

        System.out.println(str);
    }
}