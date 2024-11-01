import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str1 = st.nextToken();
        String str2 = st.nextToken();


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = str1.length()-1; i >= 0; i--) {
            char ch = str1.charAt(i);
            if (ch >= '0' && ch <= '9') {
                list1.add(ch-'0');
            }
        }

        for (int i = str2.length()-1; i >= 0; i--) {
            char ch = str2.charAt(i);
            if (ch >= '0' && ch <= '9') {
                list2.add(ch-'0');
            }
        }
        
        int cnt = 1;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < list1.size(); i++) {
            num1 += (list1.get(i)*cnt);
            cnt *= 10;
        }

        cnt = 1;
        for (int i = 0; i < list2.size(); i++) {
            num2 += (list2.get(i)*cnt);
            cnt *= 10;
        }

        System.out.println(num1 + num2);

    }
}