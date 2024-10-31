import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] alpa = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] num = new int[26];

        while(true) {
            String str = br.readLine();
            if (str.equals("end")) {
                break;
            }

            String[] arr = str.split(" ");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 26; j++) {
                    if (arr[i].equals(alpa[j])) {
                        num[j]++;
                    }
                }
            }

            for (int i = 0; i < 26; i++) {
                if (num[i] != 0) {
                    sb.append(alpa[i] + " : " + num[i] + "\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}