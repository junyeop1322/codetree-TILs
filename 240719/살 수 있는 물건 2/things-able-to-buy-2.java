import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        String str;

        if (a >= 3000) {
            str = "book";
        } else if (a >= 1000) {
            str = "mask";
        } else if (a >= 500) {
            str = "pen";
        } else {
            str = "no";
        }

        System.out.println(str);
    }
}