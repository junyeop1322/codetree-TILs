import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());

        upPrint(1);
        System.out.println();
        downPrint(n);
    }

    static void upPrint(int num) {
        System.out.print(num + " ");

        if (num == n) {
            return;
        }

        upPrint(num+1);
    }

    static void downPrint(int num) {
        System.out.print(num + " ");

        if (num == 1) {
            return;
        }

        downPrint(num-1);
    }
}