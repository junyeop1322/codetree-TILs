import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        if (a >= 1.0) {
            System.out.println("High");
        } else if (a >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}