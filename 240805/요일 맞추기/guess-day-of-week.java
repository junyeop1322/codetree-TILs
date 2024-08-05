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

        String[] day = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        Calendar cal1 = new GregorianCalendar(2011, m1-1, d1);
        Calendar cal2 = new GregorianCalendar(2011, m2-1, d2);

        int firstDay = Calendar.MONDAY;
        cal1.set(Calendar.DAY_OF_WEEK, firstDay);

        long difMill = cal2.getTimeInMillis() - cal1.getTimeInMillis();
        long difDay = difMill / (24 * 60 * 60 * 1000);
        
        // 두 번째 날짜의 요일 계산
        int ans = (int)((firstDay + difDay - 1) % 7 + 1);

        if (ans <= 0) {
            ans += 7;
        }

        System.out.println(day[ans]);
    }
}