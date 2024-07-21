import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int aAge = Integer.parseInt(st.nextToken());
        String aSex = st.nextToken();

        st = new StringTokenizer(br.readLine(), " ");
        int bAge = Integer.parseInt(st.nextToken());
        String bSex = st.nextToken();

        if ((aAge >= 19 && aSex.equals("M")) || (bAge >= 19 && bSex.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}