import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int idx = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(str)) {
                idx = i+1;
                break;
            }
        }

        Calendar cal1 = new GregorianCalendar(2024, m1-1, d1);
        Calendar cal2 = new GregorianCalendar(2024, m2-1, d2);

        int cnt = 0;
        while (cal1.compareTo(cal2) <= 0) {
            if (cal1.get(Calendar.DAY_OF_WEEK) == idx) {
                cnt++;
            }

            cal1.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(cnt);

    }
}