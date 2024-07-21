import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sex = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        String str = "";

        if (sex == 0) {
            if (age >= 19) {
                str = "MAN";
            } else {
                str = "BOY";
            }
        } else {
            if (age >= 19) {
                str = "WOMAN";
            } else {
                str = "GIRL";
            }
        }

        System.out.println(str);
    }
}