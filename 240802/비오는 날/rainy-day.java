import java.io.*;
import java.util.*;

class Weather {
    String date;
    String day;
    String wea;

    public Weather(String date, String day, String wea) {
        this.date = date;
        this.day = day;
        this.wea = wea;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        ArrayList<Weather> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String date = st.nextToken();
            String day = st.nextToken();
            String wea = st.nextToken();

            if (wea.equals("Rain")) {
                list.add(new Weather(date, day, wea));
            }
        }

        Collections.sort(list, (o1, o2) -> {
            return o1.date.compareTo(o2.date);
        });

        System.out.println(list.get(0).date + " " + list.get(0).day + " " + list.get(0).wea);

    }
}