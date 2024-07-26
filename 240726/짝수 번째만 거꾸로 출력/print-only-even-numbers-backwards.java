import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] arr = new char[str.length()/2];
        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((i+1) % 2 == 0) {
                arr[idx] = str.charAt(i);
                idx++;
            }
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}