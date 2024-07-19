import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n >= 80) {
            System.out.println("pass");
        } else {
            System.out.println((80 - n) + " more score");
        }
    }
}