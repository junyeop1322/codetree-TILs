import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String str;

        if (s.equals("S")) {
            str = "Superior";
        } else if (s.equals("A")) {
            str = "Excellent";
        } else if (s.equals("B")) {
            str = "Good";
        } else if (s.equals("C")) {
            str = "Usually";
        } else if (s.equals("D")) {
            str = "Effort";
        } else {
            str = "Failure";
        }

        System.out.println(str);
    }
}