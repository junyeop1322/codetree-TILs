import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        char[] arr = new char[str1.length()];
        char[] brr = new char[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr[i] = str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            brr[i] = str2.charAt(i);
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}