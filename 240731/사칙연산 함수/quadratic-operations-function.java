import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        String order = st.nextToken();
        int m = Integer.parseInt(st.nextToken());

        System.out.println(n + " " + order + " " + m + " = " + cal(n, m, order));
    }

    static int cal(int a, int b, String order) {
        int num = 0;

        switch(order) {
            case "+" :
                num = a + b;
                break;
            case "-" :
                num = a - b;
                break;
            case "*" :
                num = a * b;
                break;
            case "/" :
                num = a / b;
                break;
        }

        return num;
    }
}