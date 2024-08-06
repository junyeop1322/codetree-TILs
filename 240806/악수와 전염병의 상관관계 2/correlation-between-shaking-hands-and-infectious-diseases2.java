import java.io.*;
import java.util.*;

class User {
    int time;
    int a;
    int b;

    public User(int time, int a, int b) {
        this.time = time;
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        arr[p-1] = 1;
        User[] user = new User[t];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int time = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            user[i] = new User(time, a, b);
        }

        Arrays.sort(user, (o1, o2) -> {
            return o1.time - o2.time;
        });

        int cnt = 0;
        for (int i = 0; i < t; i++) {
            int x = user[i].a;
            int y = user[i].b;

            if (arr[x] != 0 || arr[y] != 0) {
                if (arr[x] != k && arr[y] != k) {
                    arr[x]++;
                    arr[y]++;
                }

            }

            if (cnt == k) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}