import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.substring(0, 1) + str.substring(2, str.length()-2) + str.substring(str.length()-1, str.length());
        
        System.out.println(str);
    }
}