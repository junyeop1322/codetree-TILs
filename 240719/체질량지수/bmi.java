import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double h = Double.parseDouble(st.nextToken());
        double w = Double.parseDouble(st.nextToken());

        double bmi = Math.floor((10000 * w) / (h * h));

        System.out.printf("%.0f\n", bmi);

        if (bmi >= 25) {
            System.out.println("Obesity");
        }
        
    }
}