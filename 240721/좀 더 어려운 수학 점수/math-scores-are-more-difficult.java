import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int aMath = Integer.parseInt(st.nextToken());
        int aEng = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int bMath = Integer.parseInt(st.nextToken());
        int bEng = Integer.parseInt(st.nextToken());

        String ans = "";

        if (aMath != bMath) {
            if (aMath > bMath) {
                ans = "A";
            } else {
                ans = "B";
            }
        } else {
            if (aEng > bEng) {
                ans = "A";
            } else {
                ans = "B";
            }
        }

        System.out.println(ans);
    }
}