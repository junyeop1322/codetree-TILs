import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String order = br.readLine();

        int x = 0;
        int y = 0;
        int v = 1;

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);

            switch(ch) {
                case 'L' :
                    if (v == 5) {
                        v = 1;
                    } else {
                        v++;
                    }
                    break;
                case 'R' :
                    if (v == 1) {
                        v = 4;
                    } else {
                        v--;
                    }
                    break;
                case 'F' :
                    if (v == 1) {
                        y++;
                    } else if (v == 2) {
                        x--;
                    } else if (v == 3) {
                        y--;
                    } else {
                        x++;
                    }
            }
        }

        System.out.println(x + " " + y);
    }
}