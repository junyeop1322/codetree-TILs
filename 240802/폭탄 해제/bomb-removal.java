import java.io.*;
import java.util.*;

class Bomm {
    String code;
    String color;
    int sec;

    public Bomm(String code, String color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Bomm bomm = new Bomm(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

        System.out.println("code : " + bomm.code);
        System.out.println("color : " + bomm.color);
        System.out.println("second : " + bomm.sec);
    }
}