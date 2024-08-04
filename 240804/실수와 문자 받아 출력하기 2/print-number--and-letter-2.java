import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        double x = Double.parseDouble(br.readLine());
        double y = Double.parseDouble(br.readLine());

        System.out.printf("%.2f\n%.2f\n%s\n", y, x, s);
    }
}