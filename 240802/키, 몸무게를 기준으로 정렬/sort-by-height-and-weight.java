import java.io.*;
import java.util.*;

class User {
    String n;
    int h;
    int w;

    public User(String n, int h, int w) {
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

        int N = Integer.parseInt(br.readLine());
        User[] user = new User[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String n = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            user[i] = new User(n, h, w);
        }

        Arrays.sort(user, (o1, o2) -> {
            if (o1.h == o2.h) {
                return o2.w - o1.w;
            } else {
                return o1.h - o2.h;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.printf("%s %d %d\n", user[i].n, user[i].h, user[i].w);
        }
    }
}