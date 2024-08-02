import java.io.*;
import java.util.*;

class User {
    int n;
    int h;
    int w;

    public User(int n, int h, int w) {
        this.n = n;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        User[] user = new User[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            user[i] = new User(i+1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(user, (o1, o2) -> {
            if (o1.h == o2.h) {
                return o2.w - o1.w;
            } else {
                return o1.h - o2.h;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", user[i].h, user[i].w, user[i].n);
        }
    }
}