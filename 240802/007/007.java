import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Info info = new Info(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("secret code : " + info.code);
        System.out.println("meeting point : " + info.point);
        System.out.println("time : " + info.time);

    }
}

class Info {
    String code;
    String point;
    int time;

    public Info(String code, String point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }
}