import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(2);
            return;
        } else if (n == 2) {
            System.out.println(3);
            return;
        }

        int num = n-1;

        int ans1 = 0;
        int ans2 = 0;

        while (true) {
            boolean check = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                ans1 = num;
                break;
            }
            num--;
        }

        num = n+1;

        while (true) {
            boolean check = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                ans2 = num;
                break;
            }
            num++;

            if ((n - ans1) == (ans2 - n)) {
                System.out.println(ans1 + " " + ans2);
            } else {
                if (n - ans1 < ans2 - n) {
                    System.out.println(ans1);
                } else {
                    System.out.println(ans2);
                }
            }    
            
        }
    }
}