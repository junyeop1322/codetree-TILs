import java.io.*;
import java.util.*;

class User {
    String n;
    int a;
    int b;
    int c;

    public User(String n, int a, int b, int c) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            user[i] = new User(n, a, b, c);
        }

        Arrays.sort(user, (o1, o2) -> {
            return (o1.a + o1.b + o1.c) - (o2.a + o2.b + o2.c);
        });

        for (int i = 0; i < N; i++) {
            System.out.println(user[i].n + " " + user[i].a + " " + user[i].b + " " + user[i].c);
        }
    }
}