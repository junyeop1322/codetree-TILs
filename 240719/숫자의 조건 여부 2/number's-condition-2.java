import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        
        if (a == 5) {
            System.out.println("A");
        }

        if (a % 2 == 0) {
            System.out.println("B");
        }
    }
}