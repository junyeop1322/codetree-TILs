import java.io.*;
import java.util.*;

class User {
    String n;
    int h;
    double w;

    public User(String n, int h, double w) {
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

        User[] user = new User[5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            user[i] = new User(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
        }

        Arrays.sort(user, (o1, o2) -> {
            return o1.n.compareTo(o2.n);
        });

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", user[i].n, user[i].h, user[i].w);
        }
        System.out.println();

        Arrays.sort(user, (o1, o2) -> {
            return o2.h - o1.h;
        });

        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", user[i].n, user[i].h, user[i].w);
        }
    }
}