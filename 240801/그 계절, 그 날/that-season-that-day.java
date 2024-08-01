import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(findSeason(m, d, checkYear(y)));
    }

    static boolean checkYear(int y) { // 윤년이면 true, 아니면 false
        if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }

    static String findSeason(int m, int d, boolean check) {
        if (m < 1 && m > 12) {
            return "-1";
        }
        String str;

        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (check) {
            month[2] = 29;

            if (d <= month[m]) {
                if ((m >= 1 && m <= 2) || m == 12) {
                    str = "Winter";
                } else if (m >= 3 && m <= 5) {
                    str = "Spring";
                } else if (m >= 6 && m <= 8) {
                    str = "Summer";
                } else {
                    str = "Fall";
                }
            } else {
                str = "-1";
            }
        } else {
            if (d <= month[m]) {
                if ((m >= 1 && m <= 2) || m == 12) {
                    str = "Winter";
                } else if (m >= 3 && m <= 5) {
                    str = "Spring";
                } else if (m >= 6 && m <= 8) {
                    str = "Summer";
                } else {
                    str = "Fall";
                }
            } else {
                str = "-1";
            }
        }

        return str;
    }
}