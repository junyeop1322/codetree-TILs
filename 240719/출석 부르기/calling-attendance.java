import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = {"John", "Tom", "Paul"};

        if (n > 3) {
            System.out.println("Vacancy");
            return;
        }

        System.out.println(arr[n-1]);
    }
}