import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int num = i;
                int num2 = n/i;

                if (num != num2) {
                    list.add(num);
                    list.add(num2);
                } else {
                    list.add(num);
                }
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
        }

        System.out.println(sb);

    }
}